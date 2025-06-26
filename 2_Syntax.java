// Java program to demonstrate basic syntax

public class HelloWorld {

    public static void main(String[] args) {
        // Variable declaration
        int a = 10;
        int b = 20;

        // Arithmetic operation
        int sum = a + b;

        // Output
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Sum of a and b: " + sum);

        // Conditional statement
        if (sum > 20) {
            System.out.println("Sum is greater than 20.");
        } else {
            System.out.println("Sum is 20 or less.");
        }

        // Loop statement
        System.out.println("Printing numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
