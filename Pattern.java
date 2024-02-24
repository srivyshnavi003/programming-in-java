import java.util.Scanner;

public class Pattern {
    
    // Function to calculate binomial coefficient C(n, k)
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            
            // Print spaces for alignment
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("  ");
            }
            
            // Print numbers for the current row
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", binomialCoeff(i, j));
            }
            
            // Move to the next line after printing numbers for each row
            System.out.println();
        }
        
        scanner.close();
    }
}