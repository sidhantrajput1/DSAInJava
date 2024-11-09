package Math;

public class SumOfDigit {
    static int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 1234;

        int result = sumOfDigit(n);
        System.out.print("Sum of digit is : "+result);
    }
}
