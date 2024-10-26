package ArraysInJava;

public class Reverse {
    // Bad practice
    static void reverse(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    // Reverse array 
    // Write a Java program to reverse an array of integer values.
    static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(arr);
        System.err.println();
        reverseArr(arr);
        printArray(arr);
    }
}
