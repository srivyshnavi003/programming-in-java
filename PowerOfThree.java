import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();

        boolean isPowerOfThree = checkPowerOfThree(n);
        
        if(isPowerOfThree)
            System.out.println(n + " is a power of three.");
        else
            System.out.println(n + " is not a power of three.");
    }

    public static boolean checkPowerOfThree(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}