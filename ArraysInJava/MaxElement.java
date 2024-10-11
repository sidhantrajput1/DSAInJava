package ArraysInJava;

public class MaxElement {
    static int findMaxElement(int[] arr) {
        int n = arr.length;
        int max= arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        System.err.println(findMaxElement(arr));
    }
}
