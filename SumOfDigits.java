import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an N-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = calculateSingleDigitSum(number);
        System.out.println("Sum of digits until single digit: " + sum);
    }

    public static int calculateSingleDigitSum(int num) {
        int sum = num;
        while (sum > 9) {
            int tempSum = 0;
            // Sum up digits of the current number
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }
        return sum;
    }
}