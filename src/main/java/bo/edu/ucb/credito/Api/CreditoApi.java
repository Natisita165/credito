package bo.edu.ucb.credito.Api;

import bo.edu.ucb.credito.Bl.CreditoBl;
import bo.edu.ucb.credito.Dto.Credito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/credits")
public class CreditoApi {

    CreditoBl creditoBl;

    @Autowired
    public CreditoApi(CreditoBl creditoBl){
        this.creditoBl=creditoBl;
    }

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public Credito getCuotas(@RequestParam Integer Cliente_client_id){
        return creditoBl.getCuotasR(Cliente_client_id);
    }
    @RequestMapping(value = "/get/CuotaP", produces = MediaType.APPLICATION_JSON_VALUE)
    public Credito getCuotasP(@RequestParam Integer Cliente_client_id){
        return creditoBl.getCuotasP(Cliente_client_id);
    }
}
