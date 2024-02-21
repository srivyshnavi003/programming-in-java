public class ArrayShift {
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 8};
        int[] B = {1, 2, 3, 4, 5};

        boolean condition = A.length > B.length;

        if (condition) {
            for (int i = 0; i < B.length; i++) {
                B[i] = A[i];
            }
        } else {
            for (int i = B.length - 1; i >= 0; i--) {
                B[i] = A[i];
            }
        }

        System.out.println("Array B after shifting: ");
        for (int value : B) {
            System.out.print(value + " ");
        }
    }
}