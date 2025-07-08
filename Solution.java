import java.util.ArrayList;
import java.util.List;

public class Solution {
    // Rotates the array left by k positions and returns the result
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        k = k % arr.size();
        if (k < 0) {
            k = k + arr.size();
        }
        // k = arr.size()-k;
        for (int i = 0; i < k; i++) {
            rotateOnce(arr);
        }
        return arr; // ? Now this matches the return type
    }

    private static void rotateOnce(ArrayList<Integer> arr) {
        int temp = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            arr.set(i - 1, arr.get(i));
        }
        arr.set(arr.size() - 1, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
ArrayList<Integer> result = Solution.rotateArray(list, 1);
System.out.println(result);
    }
}
