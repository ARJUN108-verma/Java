public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = " + c);
        c += b;
        System.out.println("c += b : " + c);
        c -= b;
        System.out.println("c -= b : " + c);
        c *= b;
        System.out.println("c *= b : " + c);
        c /= b;
        System.out.println("c /= b : " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = +a;
        System.out.println("+a = " + d);
        d = -a;
        System.out.println("-a = " + d);
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
    }
}
