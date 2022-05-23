package bo.edu.ucb.credito.Dao;

import bo.edu.ucb.credito.Dto.Credito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CreditoDao {

    private DataSource dataSource;

    @Autowired
    public CreditoDao(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public Credito getCuotasR (Integer Cliente_client_id){
        System.out.println("entro a cuotas");
        String sql = "SELECT cantidadT, cantidadF, cuotas, cuotasR, Cliente_client_id" +
                " FROM Credito WHERE Cliente_client_id= (?)";
        Credito cre= new Credito();
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement param = conn.prepareStatement(sql);
        )
        {
            param.setInt(1,Cliente_client_id);
            ResultSet rs = param.executeQuery();
            while (rs.next()){
                cre.setCantidadT(rs.getDouble("cantidadT"));
                cre.setCantidadF(rs.getDouble("cantidadF"));
                cre.setCuotas(rs.getInt("cuotas"));
                cre.setCuotasR(rs.getInt("cuotasR"));
                cre.setCliente_client_id(rs.getInt("Cliente_client_id"));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cre;
    }


    public Credito getCuotasP (Integer Cliente_client_id){
        System.out.println("entro a cuotas");
        String sql = "SELECT cantidadT, cuotas, cuotasP, Cliente_client_id" +
                " FROM Credito WHERE Cliente_client_id= (?)";
        Credito cre= new Credito();
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement param = conn.prepareStatement(sql);
        )
        {
            param.setInt(1,Cliente_client_id);
            ResultSet rs = param.executeQuery();
            while (rs.next()){
                cre.setCantidadT(rs.getDouble("cantidadT"));
                cre.setCuotas(rs.getInt("cuotas"));
                cre.setCuotasP(rs.getInt("cuotasP"));
                cre.setCliente_client_id(rs.getInt("Cliente_client_id"));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cre;
    }






    /*public Credito getCuotasRInfo (Integer Cliente_client_id){
        System.out.println("entro a cuotas");
        String sql = "SELECT c.cantidadT, c.cantidadF, c.cuotas, c.cuotasR, c.inmueble, " +
                "cli.first_name, cli.Card_card_id" +
                " FROM Credito c, Cliente cli WHERE c.Cliente_client_id= (?) AND " +
                "cli.client_id= c.Cliente_client_id ";
        Credito cre= new Credito();
        Cliente cli= new Cliente();
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement param = conn.prepareStatement(sql);
        )
        {
            param.setInt(1,Cliente_client_id);
            ResultSet rs = param.executeQuery();
            while (rs.next()){
                cre.setCantidadT(rs.getDouble("cantidadT"));
                cre.setCantidadF(rs.getDouble("cantidadF"));
                cre.setCuotas(rs.getInt("cuotas"));
                cre.setCuotasR(rs.getInt("cuotasR"));
                cli.setFirst_name(rs.getString("first_name"));
                cli.setCard_card_id(rs.getInt("Card_card_id"));

            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cre;
    }*/


}
