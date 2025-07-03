
package myproject;

public class Person {
    // Attributes
    private String nombre;
    private String apellido;
    private int edad;
    private boolean mayorEdad;
    
    // Construct
    public Person(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    // Getter and Setter
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    // Methods
    public void saludar() {
        System.out.println("Hola, " + nombre + " " + apellido);
    }
}
