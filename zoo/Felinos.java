
package zoo;

public class Felinos extends Animales {
    // Attributes
    private String raza;
    private int numero_patas;
    private boolean come_carne;
    
    // Construct
    public Felinos(String especie, String habitat, String hablar) {
        super(especie, habitat, hablar);
    }

    // Getter and Setter
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNumero_patas() {
        return numero_patas;
    }

    public void setNumero_patas(int numero_patas) {
        this.numero_patas = numero_patas;
    }

    public boolean isCome_carne() {
        return come_carne;
    }

    public void setCome_carne(boolean come_carne) {
        this.come_carne = come_carne;
    }

}
