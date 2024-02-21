import java.util.Scanner;

public class MedianMeetingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 elements for the first array:");
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter 10 elements for the second array:");
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        int medianIndex = findMedianMeetingPoint(arr1, arr2);
        if (medianIndex != -1) {
            System.out.println("Median Meeting Point: " + arr1[medianIndex]);
        } else {
            System.out.println("No meeting point found.");
        }

        scanner.close();
    }

    public static int findMedianMeetingPoint(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int medianIndex = -1;

        for (int i = 0; i < len1; i++) {
            for (int j = len2 - 1; j >= 0; j--) {
                if (arr1[i] == arr2[j]) {
                    medianIndex = i;
                    break;
                }
            }
            if (medianIndex != -1) {
                break;
            }
        }
        return medianIndex;
    }
}