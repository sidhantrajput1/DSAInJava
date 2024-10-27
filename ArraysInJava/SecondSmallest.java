package ArraysInJava;

public class SecondSmallest {
    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    static int secondMin(int[] arr) {
        int min = findMin(arr);

        for(int  i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        int second = findMin(arr);

        return second;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};

        int result = secondMin(arr);
        System.err.print(result);
    }
}
