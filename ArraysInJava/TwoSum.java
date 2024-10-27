package ArraysInJava;
import java.util.*;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        int st = 0;
        int end = arr.length-1;

        while (st <= end) {
            int sum = arr[st] + arr[end];

            if(sum == target) {
                return new int[] {st, end};
            } else if(sum < target) {
                st++;
            } else {
                end--;
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7};
        int target = 9;

        int[] result = twoSum(arr, target);
        System.err.print(Arrays.toString(result));
    }
}
