package ArraysInJava;

public class SumOfArray {

    static int sumOfArray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum +arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int result = sumOfArray(arr);
        System.out.println("Sum is : "+result);

    }
}
