public class DataTypeConversionDemo {
    public static void main(String[] args) {
        // Implicit conversion (widening) from smaller data types to larger ones
        byte byteVar = 10;
        short shortVar = byteVar;       // byte to short
        int intVar = shortVar;          // short to int
        long longVar = intVar;          // int to long
        float floatVar = longVar;       // long to float
        double doubleVar = floatVar;    // float to double
        
        // Printing values after conversion
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
    }
}