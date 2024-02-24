import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        
        int[] nums = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number in the array is: " + missingNumber);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;

        // Calculate the sum of all elements in the array
        for (int num : nums) {
            arraySum += num;
        }

        // The missing number is the difference between the sum of all natural numbers up to n
        // and the sum of elements in the array
        return totalSum - arraySum;
    }
}