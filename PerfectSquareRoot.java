import java.util.Scanner;

public class PerfectSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a perfect square number: ");
        int number = scanner.nextInt();
        scanner.close();

        double squareRootPositive = Math.sqrt(number);
        double squareRootNegative = -Math.sqrt(number);

        if (number < 0 || Math.floor(squareRootPositive) != squareRootPositive) {
            System.out.println("The number entered is not a perfect square.");
        } else {
            System.out.println("Square root (positive value): " + squareRootPositive);
            System.out.println("Square root (negative value): " + squareRootNegative);
        }
    }
}