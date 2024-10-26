package ArraysInJava;

public class CommonEleInArray {

    static void commonEleArray(int[] arr1, int[] arr2) {
        
        for(int i = 0; i < arr1.length; i++)  {
            for(int j =  0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                }
            }
            // System.out.println();
        }
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {19, 18, 3, 77, 5, 00 ,7};
        int[] arr2 = {1, 14, 3, 4, 5, 9 ,11};

        commonEleArray(arr1, arr2);
    }
}
