import java.util.Scanner;

public class PatternPrinter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to be printed: ");
        int times = scanner.nextInt();

        for (int i = 1; i <= times; i++) {
            // Print % for each row based on the row number
            for (int j = 1; j <= i; j++) {
                System.out.print("% ");
            }
            System.out.println();
        }

        scanner.close();
    }
}