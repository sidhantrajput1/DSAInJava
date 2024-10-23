package ArraysInJava;
// import java.util.*;
// Write a Java program to remove a specific element from an array.
public class RemoveElement {
    static int[] removeElment(int[] arr, int el) {
        
        int count = 0;
        for(int i = 0; i< arr.length; i++) {
            if (arr[i] == el) {
                count++;
            }
        }

        int[] newArr = new int[arr.length - count];

        
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != el) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }

    static int removeEle(int[] arr, int val) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != val) {
                arr[count++] = arr[i];
            }
        }
        return count;
    } 

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, 12, 56, 78, 40};

        int[] result = removeElment(arr, 56) ;
        // System.out.println("Array after removing element: " + Arrays.toString(result));

        printArray(result);
        
    }
}
