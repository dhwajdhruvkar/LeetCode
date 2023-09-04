// Define the arithmetic interface
interface Arithmetic {
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
    void mod(int a, int b);
}

// Implement the arithmetic interface
class Calculator implements Arithmetic {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + result);
    }
    
    public void sub(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + result);
    }
    
    public void mul(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + result);
    }
    
    public void div(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Division: " + a + " / " + b + " = " + result);
        } else {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
    
    public void mod(int a, int b) {
        if (b != 0) {
            int result = a % b;
            System.out.println("Modulus: " + a + " % " + b + " = " + result);
        } else {
            System.out.println("Error: Cannot perform modulus with zero!");
        }
    }
}

// Sample usage
public class calculator {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();
        
        // Perform arithmetic operations
        calculator.add(5, 3);
        calculator.sub(5, 3);
        calculator.mul(5, 3);
        calculator.div(5, 3);
        calculator.mod(5, 3);
    }
}
