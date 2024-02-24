import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Checking eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote. You need to wait for " + yearsLeft + " more year(s) to be eligible.");
        }

        scanner.close();
    }
}