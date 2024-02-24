 
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        ArrayList<Integer> mergedList = mergeArrays(arr1, arr2);
        
        System.out.println("Merged Array: " + mergedList);
    }

    private static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> mergedList = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }

        return mergedList;
    }
}