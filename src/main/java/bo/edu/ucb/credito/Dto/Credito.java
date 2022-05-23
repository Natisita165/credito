package bo.edu.ucb.credito.Dto;

public class Credito {
    private Integer credito_id;
    private String garante;
    private Integer ingreso;
    private Double cantidadT;
    private Double cantidadF;
    private Integer cuotas;
    private Integer cuotasR;
    private Integer cuotasP;
    private String inmueble;
    private Integer Cliente_client_id;

    public Credito(){

    }

    public Integer getCredito_id() {
        return credito_id;
    }

    public void setCredito_id(Integer credito_id) {
        this.credito_id = credito_id;
    }

    public String getGarante() {
        return garante;
    }

    public void setGarante(String garante) {
        this.garante = garante;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public Double getCantidadT() {
        return cantidadT;
    }

    public void setCantidadT(Double cantidad) {
        this.cantidadT = cantidad;
    }

    public Double getCantidadF() {
        return cantidadF;
    }

    public void setCantidadF(Double cantidad) {
        this.cantidadF = cantidad;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public Integer getCuotasR() {
        return cuotasR;
    }

    public void setCuotasR(Integer cuotasR) {
        this.cuotasR = cuotasR;
    }

    public Integer getCuotasP() {
        return cuotasP;
    }

    public void setCuotasP(Integer cuotasP) {
        this.cuotasP = cuotasP;
    }

    public String getInmueble() {
        return inmueble;
    }

    public void setInmueble(String inmueble) {
        this.inmueble = inmueble;
    }

    public Integer getCliente_client_id() {
        return Cliente_client_id;
    }

    public void setCliente_client_id(Integer cliente_client_id) {
        Cliente_client_id = cliente_client_id;
    }
}
