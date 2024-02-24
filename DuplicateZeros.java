import java.util.Scanner;

public class DuplicateZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        duplicateZeros(arr);

        System.out.println("Array after duplicating zeros:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        // Count the number of zeros to be duplicated
        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                if (i == length - possibleDups) {
                    // For cases where there are no more space left to duplicate zeros
                    arr[length] = 0;
                    length--;
                    break;
                }
                possibleDups++;
            }
        }

        // Start from the last element and move elements to their correct positions
        for (int i = length - possibleDups; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}