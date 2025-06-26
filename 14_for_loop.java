public class LoopExample {
    public static void main(String[] args) {
        
        // Simple for loop
        System.out.println("Simple for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Nested for loop
        System.out.println("\nNested for loop (printing a pattern):");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
