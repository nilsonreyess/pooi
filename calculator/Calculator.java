
package calculator;

public class Calculator {

    public static void main(String[] args) {
        Operation suma = new Operation(100, 25, 1);
        
        System.out.println("La suma es: " + suma.getResult());
        
    }
    
}
