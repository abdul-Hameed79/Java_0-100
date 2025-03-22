// Exception Handling using multiple catch blocks
package ExceptionHandling;

public class class2 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 0;

        int[] values = {1, 4, 6, 9};

        try {
            System.out.println(num1 / num2);

        } catch(ArithmeticException e) {
            System.out.println("Error: " + e);
        } try {
            System.out.println(values[5]);
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+ e);
        } 
        System.out.println("byee");
    }
}