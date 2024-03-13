public class Data {
    public static void main(String[] args) {
        // Integral Types
        byte byteVar = 127;         // 8-bit signed integer
        short shortVar = 32767;     // 16-bit signed integer
        int intVar = 2147483647;    // 32-bit signed integer
        long longVar = 9223372036854775807L;  // 64-bit signed integer

        // Floating-Point Types
        float floatVar = 3.4e38f;   // 32-bit floating-point
        double doubleVar = 1.7e308; // 64-bit floating-point

        // Characters
        char charVar = 'A';         // 16-bit Unicode character

        // Boolean
        boolean boolVar = true;     // true or false

        // Output
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
    }
}
