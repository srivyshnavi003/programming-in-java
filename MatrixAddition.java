
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix 1
        System.out.println("Enter matrix 1:");
        int[][] mat1 = readMatrix(scanner);

        // Input matrix 2
        System.out.println("Enter matrix 2:");
        int[][] mat2 = readMatrix(scanner);

        // Perform matrix addition
        int[][] result = addMatrices(mat1, mat2);

        // Display the result
        System.out.println("Matrix Addition Result:");
        displayMatrix(result);

        scanner.close();
    }

    // Function to read a matrix from user input
    private static int[][] readMatrix(Scanner scanner) {
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Function to perform matrix addition
    private static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int n = mat1[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return result;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}