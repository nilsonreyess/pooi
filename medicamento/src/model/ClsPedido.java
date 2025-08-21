
package model;

import java.util.ArrayList;

public class ClsPedido {
    // Attributes
    private String medicamento;
    private String tipoMedicamento;
    private int cantidad;
    private String distribuidor;
    private final ArrayList<String> despachar = new ArrayList<>();
    
    // Construct
    public ClsPedido() {
    }
    
    // Getter and Setter
    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getDespachar() {
        String sucursales = "<html><body>Despachar a:<br>";
        for (String sucursal : this.despachar) {
            sucursales += creaDespacho(sucursal);
        }
        return sucursales += "</body></html>";
    }

    public void setDespachar(String despachar) {
        this.despachar.add(despachar);
    }
    
    // Personalized Method
    public String creaDespacho (String sucursal) {
        String despacho = "";
        if (sucursal.equals("Principal")) {
            despacho = "PRINCIPAL<br>Calle de la Rosa n. 28 <br><br>";
        }
        if (sucursal.equals("Sucursal")) {
            despacho = "SUCURSAL<br>Calle Alcazabilla n. 3<br>";
        }
        return despacho;
    }
    
}
