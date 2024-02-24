public class Pattern4 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j < i)
                    System.out.print(i + " ");
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}