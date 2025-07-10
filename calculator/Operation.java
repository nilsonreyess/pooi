
package calculator;

public class Operation {
    // Attributes
    private int numero_1;
    private int numero_2;
    private int operacion;
    private int result;
    
    // Construct
    public Operation(int numero_1, int numero_2, int operacion) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
        this.operacion = operacion;
    }
    
    //Getter and Setter
    public int getResult() {
        if (operacion == 1) {
            result = numero_1 + numero_2;
        }
        return result;
    }

}
