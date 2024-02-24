import java.util.Scanner;

public class NthOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the value of n and m from the user
        System.out.print("Enter the value of m (number of initial odd numbers): ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n (position of the odd number): ");
        int n = scanner.nextInt();

        // Calculating and displaying the nth odd number after m odd numbers
        int nthOddNumber = findNthOddNumber(m, n);
        System.out.println("The " + n + "th odd number after " + m + " odd numbers is: " + nthOddNumber);

        scanner.close();
    }

    public static int findNthOddNumber(int m, int n) {
        return m * 2 + n * 2 - 1;
    }
}