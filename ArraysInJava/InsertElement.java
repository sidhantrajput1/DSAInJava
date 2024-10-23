package ArraysInJava;

public class InsertElement {
    
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int idx = 5;
        int val = 55;

        
        printArray(arr);

        System.out.println();

        for(int i = arr.length -  1 ;i > idx ; i--) {
            arr[i] = arr[i-1];
        }

        arr[idx] = val;

        System.out.print("New Array is : ");
        printArray(arr);
    }
}
