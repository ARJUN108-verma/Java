public class MethodExample {

    // Method with no return value
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // Method with parameters and no return value
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Method with return value
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        // Call method without arguments
        greet();

        // Call method with arguments
        printSum(5, 7);

        // Call method with return value
        int product = multiply(4, 6);
        System.out.println("Product: " + product);
    }
}
