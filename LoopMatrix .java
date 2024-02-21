public class LoopMatrix {

    public static void main(String[] args) {
        int n = 3;


        int[][] A = new int[n][n];


        // Assigning values 1 to 9 for A matrix
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = counter;
                counter++;
            }
        }

        int[][] B = new int[n][n];


        // Assigning value 9 to 1 for B matrix
        counter = 9;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                B[i][j] = counter;
                counter--;
            }
        }

        // Printing matrix A
        System.out.println("Matrix A (1 to 9):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Printing matrix B
        System.out.println("\nMatrix B (9 to 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}