
package myproject;

public class MyProject {

    public static void main(String[] args) {
        Person pepito = new Person("Pepito", "Perez");
        
        pepito.setMayorEdad(false);
        pepito.setEdad(10);
        
        //pepito.saludar();
        System.out.println(pepito.getNombre() + " " + pepito.getApellido());
        
        if (pepito.isMayorEdad()) {
            System.out.println("Eres mayor de edad. Tienes " + pepito.getEdad() + " años"); 
        } else {
            System.out.println("Eres menor de edad. Tienes " + pepito.getEdad() + " años");
        }
        
        // -----------------------------------------------------------
        
        Vehiculo carro = new Vehiculo("Mazda", 2019, "Negro");
        Vehiculo moto = new Vehiculo("Yamaha", 2023, "Roja");
        
        System.out.println("El carro es " + carro.getColor());
        System.out.println("La moto es " + moto.getColor());
        
        //-------------------------------------------------------------
        
        Carro mini = new Carro("Mazda", 2019, "Rojo", 5, 2, false);
        
        System.out.println("El mini transporta " + mini.getPasajeros() + " pasajeros");
        System.out.println("EL mini es de color " + mini.getColor() + ".");
        
        //-------------------------------------------------------------
        
        Carro van = new Carro("Dodge", 2024, "Plateado");
        System.out.println("La van es de marca " + van.getMarca());
        
        van.setTodo_terreno(true);
        
        if (van.isTodo_terreno()) {
            System.out.println("La van es todo terreno.");
        } else {
            System.out.println("La van NO es todo terreno.");
        }
        
        //-----------------------------------------------------------
        
        Moto akt = new Moto("AKT", 2023, "Negra");
        
        System.out.println("La moto es de marca " + akt.getMarca().toLowerCase());
        
    }
    
}
