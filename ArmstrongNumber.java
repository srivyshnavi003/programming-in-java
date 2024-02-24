import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;

        // Count number of digits
        for (; originalNum != 0; originalNum /= 10, ++n);

        originalNum = num;

        // Calculate sum of nth power of individual digits
        for (; originalNum != 0; originalNum /= 10) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }

        // Check if number is Armstrong
        if (result == num)
            return true;
        else
            return false;
    }
}