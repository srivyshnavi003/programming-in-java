import java.util.Scanner;

public class SquareAndCube {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the decimal number from the user
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();

        // Calculating and displaying the square
        double square = findSquare(number);
        System.out.println("Square of " + number + " is: " + square);

        // Calculating and displaying the cube
        double cube = findCube(number);
        System.out.println("Cube of " + number + " is: " + cube);

        scanner.close();
    }

    public static double findSquare(double number) {
        return Math.pow(number, 2);
    }

    public static double findCube(double number) {
        return Math.pow(number, 3);
    }
}