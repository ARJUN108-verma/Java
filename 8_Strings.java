public class StringExample {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);
        
        // Length of String
        System.out.println("Length of result string: " + result.length());

        // Comparing Strings
        String str3 = "Hello";
        System.out.println("Is str1 equal to str3? " + str1.equals(str3)); // true

        // Substring
        String sub = result.substring(0, 5); // "Hello"
        System.out.println("Substring (0 to 5): " + sub);

        // Changing case
        System.out.println("Uppercase: " + result.toUpperCase());
        System.out.println("Lowercase: " + result.toLowerCase());
    }
}
