// import java.util.*;

public class FindMax {
    // find the maximum value in array
    static int findmax(int[] arr) {
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }

        return max;
    }
    // find the minimum value
    static int findmin(int[] arr) {
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }

        return min;
    }

    // Reverse Array

    static void reverse(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }

    // print the arr
    static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // bubble sort in array
    static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int minIdx = i; // assume the current postion hold the minimum value
            for(int j = i; j < n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j; // update the minIdx if a smaller is find
                }
            }
            // swap the element 
            // move minimum element it's correct postion
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    //  Find the Kth Smallest
    static int kthSmallest(int[] arr, int k) {
        sort(arr);
        return arr[k - 1];
    }

    // Find the kth Largest element
    static int kthLargest(int[] arr, int k) {
        sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 4, 33, 6, 7};
        sort(arr);
        print(arr);
        System.out.println("kth smallest element : "+kthSmallest(arr, 2));
        System.out.println("kth Largest element : "+kthLargest(arr, 3));
    }
}