
package zoo;

public class Animales {
    // Attributes
    private String especie;
    private String habitat;
    private String hablar;
    
    // Construct
    public Animales(String especie, String habitat, String hablar) {
        this.especie = especie;
        this.habitat = habitat;
        this.hablar = hablar;
    }
    
    // Getter and Setter

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHablar() {
        return hablar;
    }

    public void setHablar(String hablar) {
        this.hablar = hablar;
    }
    
}
