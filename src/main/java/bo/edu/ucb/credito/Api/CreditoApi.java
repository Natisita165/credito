package bo.edu.ucb.credito.Api;

import bo.edu.ucb.credito.Bl.CreditoBl;
import bo.edu.ucb.credito.Dto.Credito;
import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    public Credito getCuotas(@RequestParam Integer clienteClientId){
        return creditoBl.getCuotasR(clienteClientId);
    }
    @RequestMapping(value = "/get/CuotaP", produces = MediaType.APPLICATION_JSON_VALUE)
    public Credito getCuotasP(@RequestParam Integer clienteClientId){
        return creditoBl.getCuotasP(clienteClientId);
    }


    @RequestMapping(path = "/post",method = RequestMethod.POST)
    public Credito crearNuevo(@RequestBody Credito credito){
        return creditoBl.crearNuevo(credito);
    }
}
