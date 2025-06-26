public class BooleanExample {
    public static void main(String[] args) {
        // Declaring boolean variables
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // Printing boolean values
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        // Using boolean in an if statement
        if (isJavaFun) {
            System.out.println("Java is indeed fun!");
        } else {
            System.out.println("Java is not fun!");
        }

        // Boolean expression example
        int a = 10;
        int b = 20;
        boolean result = a < b;

        System.out.println("Is a less than b? " + result);
    }
}
