import java.util.Scanner;

public class CompositeNumberCounter {
    
    // Function to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int compositeCount = 0;
        for (int i = 0; i < n; i++) {
            if (isComposite(arr[i])) {
                compositeCount++;
            }
        }
        
        System.out.println("Number of composite numbers in the array: " + compositeCount);
    }
}