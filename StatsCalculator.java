import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StatsCalculator {
    
    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    
    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            int mid1 = arr.length / 2 - 1;
            int mid2 = arr.length / 2;
            return (arr[mid1] + arr[mid2]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }
    
    public static int calculateMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int mode = 0;
        int maxFrequency = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = entry.getKey();
            }
        }
        
        return mode;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        double mean = calculateMean(arr);
        double median = calculateMedian(arr);
        int mode = calculateMode(arr);
        
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
}