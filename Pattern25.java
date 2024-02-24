public class Pattern25 {
    public static void main(String[] args) {
        int n = 4;

        // Print upper half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1)
                    System.out.print(i + " ");
                else
                    System.out.print(" " + i + " ");
            }
            System.out.println();
        }

        // Print lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1)
                    System.out.print(i + " ");
                else
                    System.out.print(" " + i + " ");
            }
            System.out.println();
        }
    }
}