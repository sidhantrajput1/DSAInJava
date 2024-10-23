package ArraysInJava;

// Write a Java program to find the index of an array element.
public class FindIndex {
    static int findidx(int[] arr, int idx) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] == idx) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36};
        int result = findidx(arr, 15);
        System.out.println(result);
    }
}
