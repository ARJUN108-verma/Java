public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating 'continue' and 'break':");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Continue at i = " + i);
                continue; // Skip the rest of the loop when i is 5
            }

            if (i == 8) {
                System.out.println("Break at i = " + i);
                break; // Exit the loop when i is 8
            }

            System.out.println("i = " + i);
        }

        System.out.println("Loop ended.");
    }
}
