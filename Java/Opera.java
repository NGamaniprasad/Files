public class Opera {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("AND: " + (x && y));
        System.out.println("OR: " + (x || y));
        System.out.println("NOT x: " + (!x));
        System.out.println("NOT y: " + (!y));

        // Bitwise Operators
        int m = 5, n = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("AND: " + (m & n));
        System.out.println("OR: " + (m | n));
        System.out.println("XOR: " + (m ^ n));
        System.out.println("Complement of m: " + (~m));
        System.out.println("Left Shift: " + (m << 1));
        System.out.println("Right Shift: " + (m >> 1));
        System.out.println("Unsigned Right Shift: " + (m >>> 1));

        // Assignment Operators
        int result = 10;
        System.out.println("\nAssignment Operators:");
        result += 5; // result = result + 5
        System.out.println("Addition Assignment: " + result);
        result -= 3; // result = result - 3
        System.out.println("Subtraction Assignment: " + result);
        result *= 2; // result = result * 2
        System.out.println("Multiplication Assignment: " + result);
        result /= 4; // result = result / 4
        System.out.println("Division Assignment: " + result);
        result %= 3; // result = result % 3
        System.out.println("Modulus Assignment: " + result);

        // Conditional (Ternary) Operator
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("\nConditional (Ternary) Operator:");
        System.out.println("Age Status: " + status);
    }
}
