package permutation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> stringPermutations = PermutationUtils.generatePermutations(str.toCharArray());
        System.out.println("Permutations of string " + str + ": " + stringPermutations);

        int[] arr = {1, 2, 3};
        List<String> arrayPermutations = PermutationUtils.generatePermutations(arr);
        System.out.println("Permutations of array {1, 2, 3}: " + arrayPermutations);
    }
}
