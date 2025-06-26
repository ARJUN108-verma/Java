public class ErrorHandlingDemo {
    public static void main(String[] args) {
        // 1. Compile-time Error Example (Uncomment to see error)
        // int number = "abc"; // Type mismatch error

        // 2. Runtime Error Example (Handled using try-catch)
        try {
            int result = 10 / 0; // ArithmeticException: divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 3. Null Pointer Exception Example
        try {
            String text = null;
            System.out.println(text.length()); // This throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 4. Array Index Out of Bounds Exception
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 5. Number Format Exception
        try {
            int num = Integer.parseInt("abc"); // Cannot parse string to integer
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        System.out.println("Program continues after handling all exceptions.");
    }
}
