public class DataTypeConversionDemo {
    public static void main(String[] args) {
        // Overflow scenario
        int intVar = 2147483647;  // Maximum value for int
        intVar = intVar + 1;      // Adding 1 to exceed the range
        System.out.println("Overflow: " + intVar);  // This will print a negative value due to overflow

        // Underflow scenario
        byte byteVar = 127;       // Maximum value for byte
        byteVar = (byte)(byteVar + 1); // Adding 1 to exceed the range
        System.out.println("Underflow: " + byteVar); // This will print a negative value due to underflow
    }
}