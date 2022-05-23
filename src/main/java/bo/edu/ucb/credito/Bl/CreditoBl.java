package bo.edu.ucb.credito.Bl;


import bo.edu.ucb.credito.Dao.CreditoDao;
import bo.edu.ucb.credito.Dto.Credito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditoBl {
    private final CreditoDao creditoDao;


    @Autowired
    public CreditoBl(CreditoDao creditoDao){
        this.creditoDao=creditoDao;
    }
    public Credito getCuotasR(Integer Cliente_client_id){
        return creditoDao.getCuotasR(Cliente_client_id);
    }
    public Credito getCuotasP(Integer Cliente_client_id){
        return creditoDao.getCuotasP(Cliente_client_id);
    }
}
