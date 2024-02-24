import java.util.Scanner;

public class RightTrianglePattern {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        // Loop through each row
        for (int i = 1; i <= numRows; i++) {
            // Print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing stars for each row
            System.out.println();
        }
        
        scanner.close();
    }
}