public class BitwiseOperators {
    public static void main(String[] args) {
        // Bitwise operators -> These operators are used to change the bits (Bit
        // manipulation).
        // Bit -> smallest unit of data (0, 1)

        // For 2 or more variables
        // Bitwise OR (|) -> (T T = T), (T F = T), (F T = T), (F F = F)
        // Bitwise AND (&) -> (T T = T), (T F = F), (F T = F), (F F = F)
        // Bitwise XOR (^) -> (T F = T), (F T = T), (F F = F), (T T = F)

        // For 1 variable
        // Bitwise complement (~)
        // Bitwise right shift operator (>>)
        // Bitwise left shift operator (<<)
        // int a = 12; // 1100
        // int b = 5; // 0101

        // int bitwiseOR = a | b; // 1101
        // System.out.println(bitwiseOR);

        // int bitwiseAND = a & b; // 0100
        // System.out.println(bitwiseAND);

        // int bitwiseXOR = a ^ b; // 1001
        // System.out.println(bitwiseXOR);

        
        // int rightShift = a >> 2; // 0011
        // System.out.println(rightShift);

        // int leftShift = a << 1; // 01000
        // System.out.println(leftShift);
    }
}
