public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Display array elements using a loop
        System.out.println("Elements of the array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Accessing a specific element
        System.out.println("\nThe third element is: " + numbers[2]);

        // Changing an element
        numbers[2] = 99;
        System.out.println("After changing, the third element is: " + numbers[2]);
    }
}
