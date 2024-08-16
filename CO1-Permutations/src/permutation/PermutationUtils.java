package permutation;

import java.util.ArrayList;
import java.util.List;

public class PermutationUtils {
    // Method to generate permutations of a character array (for strings)
    public static List<String> generatePermutations(char[] arr) {
        List<String> result = new ArrayList<>();
        permute(arr, 0, result);
        return result;
    }

    // Method to generate permutations of an integer array
    public static List<String> generatePermutations(int[] arr) {
        List<String> result = new ArrayList<>();
        permute(arr, 0, result);
        return result;
    }

    // Helper method to perform permutations for char array
    private static void permute(char[] arr, int start, List<String> result) {
        if (start == arr.length - 1) {
            result.add(new String(arr));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            permute(arr, start + 1, result);
            swap(arr, start, i); // backtrack
        }
    }

    // Helper method to perform permutations for int array
    private static void permute(int[] arr, int start, List<String> result) {
        if (start == arr.length - 1) {
            result.add(arrayToString(arr));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            permute(arr, start + 1, result);
            swap(arr, start, i); // backtrack
        }
    }

    // Swap elements in a character array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Swap elements in an integer array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Convert integer array to string representation
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }
}
