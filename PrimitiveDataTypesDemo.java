public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        // Integer data types
        byte byteVar = 127;          // 1 byte
        short shortVar = 32000;      // 2 bytes
        int intVar = 2000000000;     // 4 bytes
        long longVar = 9223372036854775807L; // 8 bytes

        // Floating-point data types
        float floatVar = 3.14f;      // 4 bytes
        double doubleVar = 3.14159;  // 8 bytes

        // Character data type
        char charVar = 'A';          // 2 bytes

        // Boolean data type
        boolean booleanVar = true;   // 1 bit

        // Printing values
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);
    }
}