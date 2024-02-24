import java.util.Scanner;

public class HollowSquareDollarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= rows; j++) {
                // Condition to print '$' only for boundary rows or columns
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  "); // print spaces for internal positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        scanner.close();
    }
}