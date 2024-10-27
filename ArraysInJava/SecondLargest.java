package ArraysInJava;

public class SecondLargest {
    // Write a Java program to find the second largest element in an array. 

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if (mx < arr[i]) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secondMax(int[] arr) {
        int mx = findMax(arr);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondmax = findMax(arr);

        return secondmax;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 3, 6, 8, 9, 11 , 6};

        int result = secondMax(arr);
        System.err.print(result);
    }
}
