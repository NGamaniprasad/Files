public class Bitw{
    public static void main(String[] args) {
        int a = 5;  // Binary representation: 0101
        int b = 3;  // Binary representation: 0011

        // Bitwise AND (&)
        int bitwiseAND = a & b;  // Result: 0001 (1 in decimal)
        System.out.println("Bitwise AND: " + bitwiseAND);

        // Bitwise OR (|)
        int bitwiseOR = a | b;  // Result: 0111 (7 in decimal)
        System.out.println("Bitwise OR: " + bitwiseOR);

        // Bitwise XOR (^)
        int bitwiseXOR = a ^ b;  // Result: 0110 (6 in decimal)
        System.out.println("Bitwise XOR: " + bitwiseXOR);

        // Bitwise NOT (~) - inverts the bits
        int bitwiseNOTa = ~a;  // Result: 11111111111111111111111111111010 (-6 in decimal)
        System.out.println("Bitwise NOT of a: " + bitwiseNOTa);

        // Left Shift (<<) - shifts the bits to the left
        int leftShift = a << 1;  // Result: 1010 (10 in decimal)
        System.out.println("Left shift of a: " + leftShift);

        // Right Shift (>>) - shifts the bits to the right (with sign extension)
        int rightShift = a >> 1;  // Result: 0010 (2 in decimal)
        System.out.println("Right shift of a: " + rightShift);

        // Unsigned Right Shift (>>>) - shifts the bits to the right (without sign extension)
        int unsignedRightShift = -5 >>> 1;  // Result: 01111111111111111111111111111110 (2147483646 in decimal)
        System.out.println("Unsigned right shift of -5: " + unsignedRightShift);
    }
}
