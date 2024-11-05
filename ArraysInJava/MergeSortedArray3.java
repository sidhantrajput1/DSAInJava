package ArraysInJava;
import java.util.*;

public class MergeSortedArray3 {
    static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while ( i < n1 && j < n2) {
            if(arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while(i < n1) {
            merged[k++] = arr1[i++];
        }
        
        while(j < n2) {
            merged[k++] = arr2[j++];
        }

        return Arrays.copyOf(merged, k);
        
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};


        int[] result = merge(arr1, arr2);
        for(int num : result) {
            System.err.print(num+" ");
        }
    }
}
