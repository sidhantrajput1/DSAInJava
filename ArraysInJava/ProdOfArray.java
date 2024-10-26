package ArraysInJava;
// import java.util.*;

public class ProdOfArray {

    static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] right = new int[n];

        int prod = 1;

        for(int i = n - 1; i >= 0; i--) {
            prod = prod * arr[i];
            right[i] = prod;
        } 

        int[] ans = new int[n];

        int left = 1;

        for(int i = 0; i < n-1; i++) {
            int val = left * right[i+1];

            ans[i] = val;

            left = left * arr[i];

        }

        ans[n-1] = left;

        return ans;
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // System.err.println(Arrays.toString(arr));
        int[] result = productExceptSelf(arr);
        printArray(result);
    }
}
