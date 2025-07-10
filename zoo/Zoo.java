
package zoo;

public class Zoo {

    public static void main(String[] args) {
        System.out.println("..:: ZOOLOGICO DE ANIMALES ::..");
        
        Felinos felino1 = new Felinos("Tigre", "Selva", "Grrrrr...");
        Felinos felino2 = new Felinos("Puma", "Sabana", "Miauuuu...");
        
        Ovinos ovino1 = new Ovinos("Chiva", true, "Ovino", "Finca", "Breee...");
        Ovinos ovino2 = new Ovinos("Oveja", true, "Ovino", "Ovejera", "Beeee...");
        
        System.out.println("EL Ovino 1 " + ovino1.getHablar());
        System.out.println("El felino 1 " + felino1.getHablar());
        
    }
    
}
