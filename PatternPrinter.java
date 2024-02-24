import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of times to be printed: ");
        int n = scanner.nextInt();

        // Loop to print the top half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }

        // Loop to print the bottom half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }

        scanner.close();
    }
}