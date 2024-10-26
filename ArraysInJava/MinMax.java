package ArraysInJava;

public class MinMax {
    // Write a Java program to find the maximum and minimum value of an array.
    static int max(int[] arr) {
        int mx = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(mx < arr[i]) {
                mx = arr[i];
            }
        }

        return mx;
    }
    static int min(int[] arr) {
        int min = arr[0];

        for(int  i = 0; i< arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 9 ,7 , 8};
        System.out.print("Array is : ");
        printArray(arr);

        System.err.println();

        int result = min(arr);
        System.err.println("Minimum Element of Array is : "+result);
    }
}
