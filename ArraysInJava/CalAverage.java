package ArraysInJava;

public class CalAverage {
    static double calAverage(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        double avg = sum/n;

        return avg;
    }
    public static void main(String[] args) {
        int[] arr = {20, 30, 25, 35, -16, 60, -100};

        double result = calAverage(arr);
        System.err.print(result);
    }
}
