import java.util.Scanner;

public class rectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the symbol you want to use: ");
        char symbol = scanner.next().charAt(0);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        // Print rectangle symbol pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}