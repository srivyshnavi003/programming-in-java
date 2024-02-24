public class Pattern24 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                int num = i * i;
                System.out.print(num);

                // Adjust spacing based on the length of the largest number
                int spaceCount = String.valueOf(rows * rows).length() - String.valueOf(num).length();
                for (int k = 0; k < spaceCount; k++) {
                    System.out.print(" ");
                }

                // Add extra space for even numbers to maintain alignment
                if (num % 2 == 0 && j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}