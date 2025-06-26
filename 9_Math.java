public class MathDemo {
    public static void main(String[] args) {
        // Example numbers
        double a = 9.0;
        double b = 16.0;
        double c = -10.0;

        // Math operations
        System.out.println("Square root of " + a + ": " + Math.sqrt(a));
        System.out.println("Power: " + a + "^2 = " + Math.pow(a, 2));
        System.out.println("Maximum of " + a + " and " + b + ": " + Math.max(a, b));
        System.out.println("Minimum of " + a + " and " + b + ": " + Math.min(a, b));
        System.out.println("Absolute value of " + c + ": " + Math.abs(c));
        System.out.println("Sine of 90 degrees: " + Math.sin(Math.toRadians(90)));
        System.out.println("Cosine of 0 degrees: " + Math.cos(Math.toRadians(0)));
        System.out.println("Random number between 0 and 1: " + Math.random());
        System.out.println("Round of 5.67: " + Math.round(5.67));
        System.out.println("Ceil of 5.2: " + Math.ceil(5.2));
        System.out.println("Floor of 5.8: " + Math.floor(5.8));
    }
}
