

public class MaxSum {

    public static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum sum of a contiguous subarray is "+maxSum);
    }
}
