import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= rows; i++) {
            
            // Loop to print spaces for alignment
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }

            // Loop to print asterisks for each column in the row
            for (int j = 1; j <= 2 * (rows - i) + 1; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}