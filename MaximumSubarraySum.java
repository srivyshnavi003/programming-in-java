import java.util.Scanner;

public class MaximumSubarraySum {
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

        int maxSum = findMaximumSubarraySum(nums);
        System.out.println("The sum of the largest subarray is: " + maxSum);
    }

    public static int findMaximumSubarraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Choose between extending the current subarray or starting a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum if the current subarray sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}