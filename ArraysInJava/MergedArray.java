package ArraysInJava;

public class MergedArray {
    static int[] mergedSortedArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2) {
            if(arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];                
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while( i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        while( j < n2) {
            mergedArray[k++] = arr2[j++];
        }


        return mergedArray;
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    } 

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};

        int[] mergedArray = mergedSortedArray(arr1, arr2);

        System.out.println("Merged Sorted Array:");
        printArray(mergedArray);
    }
}
