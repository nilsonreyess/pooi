
package myproject;

public class Carro extends Vehiculo{
    // Atributes
    private int pasajeros;
    private int airbags;
    private boolean todo_terreno;
    
    // Construct
    public Carro(String marca, int modelo, String color) {
        super(marca, modelo, color);
    }

    public Carro(String marca, int modelo, String color, int pasajeros, int airbags, boolean todo_terreno) {
        super(marca, modelo, color);
        this.pasajeros = pasajeros;
        this.airbags = airbags;
        this.todo_terreno = todo_terreno;
    }
    
    // Getter and Setter
    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public boolean isTodo_terreno() {
        return todo_terreno;
    }

    public void setTodo_terreno(boolean todo_terreno) {
        this.todo_terreno = todo_terreno;
    }

}
