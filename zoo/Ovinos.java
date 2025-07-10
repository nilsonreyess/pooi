
package zoo;

public class Ovinos extends Animales {
    // Attributes
   private String tipo;
   private boolean inversion;
    
    // Construct
    public Ovinos(String tipo, boolean inversion, String especie, String habitat, String hablar) {
        super(especie, habitat, hablar);
        this.tipo = tipo;
        this.inversion = inversion;
    }
    
    // Getter and Setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isInversion() {
        return inversion;
    }

    public void setInversion(boolean inversion) {
        this.inversion = inversion;
    }
    
}
