public class DataTypeConversionDemo {
    public static void main(String[] args) {
        // Explicit conversion (narrowing) from larger data types to smaller ones
        double doubleVar = 123.456;
        float floatVar = (float) doubleVar;    // double to float
        long longVar = (long) floatVar;        // float to long
        int intVar = (int) longVar;            // long to int
        short shortVar = (short) intVar;       // int to short
        byte byteVar = (byte) shortVar;        // short to byte
        
        // Printing values after conversion
        System.out.println("Double: " + doubleVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Long: " + longVar);
        System.out.println("Int: " + intVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Byte: " + byteVar);
    }
}