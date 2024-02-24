import java.util.Scanner;

public class DecimalToBinaryReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        // Convert decimal to binary
        StringBuilder binary = new StringBuilder();
        int remainder;
        while (decimal > 0) {
            remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }
        
        // Reverse the binary representation
        String reversedBinary = binary.reverse().toString();
        
        System.out.println("Binary representation: " + reversedBinary);
    }
}