
package myproject;

public class Moto extends Vehiculo {
    // Attributes
    private String placa;
    private boolean soat;
    private int ruedas;
    
    // Construct
    public Moto(String marca, int modelo, String color) {
        super(marca, modelo, color);
    }
    
    public Moto(String placa, boolean soat, int ruedas, String marca, int modelo, String color) {
        super(marca, modelo, color);
        this.placa = placa;
        this.soat = soat;
        this.ruedas = ruedas;
    }
    
    // Getter and Setter
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isSoat() {
        return soat;
    }

    public void setSoat(boolean soat) {
        this.soat = soat;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    // Personalized Methods
}
