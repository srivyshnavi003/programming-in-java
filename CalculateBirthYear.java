import java.util.Scanner;

public class CalculateBirthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int currentYear = 2073;
        int eligibilityAge = 21;

        // Input: Age of the person
        System.out.println("Enter the age of the person:");
        int age = scanner.nextInt();

        // Calculating birth year
        int birthYear = currentYear - age;

        // Calculate the year when the person is eligible to vote
        int voteEligibleYear = birthYear + eligibilityAge;

        // Calculate the years between the person's vote-eligible year and 2023
        int yearsUntil2023 = 2023 - voteEligibleYear;

        if (birthYear > 2060) {
            System.out.println("The person's birth year is after 2060.");
            System.out.println("Years between the person's vote-eligible year and 2023: " + yearsUntil2023);
        } else {
            int medianYear = (birthYear + 2023) / 2;
            System.out.println("The person's birth year is on or before 2060.");
            System.out.println("Median of birth year and 2023: " + medianYear);
        }

        scanner.close();
    }
}