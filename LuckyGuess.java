import java.util.Scanner;

public class LuckyGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 5: ");
        int userInput = scanner.nextInt();
        
        switch (userInput) {
            case 1:
                System.out.println("Congratulations! You've made a lucky guess!");
                break;
            case 2:
                System.out.println("Congratulations! You've made a lucky guess!");
                break;
            case 3:
                System.out.println("Congratulations! You've made a lucky guess!");
                break;
            case 4:
                System.out.println("Congratulations! You've made a lucky guess!");
                break;
            case 5:
                System.out.println("Congratulations! You've made a lucky guess!");
                break;
            default:
                System.out.println("Sorry, that's not a valid guess. Please enter a number between 1 and 5.");
        }
    }
}