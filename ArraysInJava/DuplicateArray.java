package ArraysInJava;

public class DuplicateArray {
    static void dupicateEle(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1;  j < arr.length; j ++) {
                if(arr[i] == arr[j] && i != j) {
                    System.err.print("Duplicate Element is : "+arr[i]);
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num+" ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 5, 6};
        printArray(arr);
        System.out.println();
        dupicateEle(arr);
    }
}