package Math;

public class AramStrongNumber {
    static boolean number(int num) {
        int k = String.valueOf(num).length();
        System.out.println(k);
        int sum = 0;
        int n = num;
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, k);
            n = n / 10;
        }
        return sum == num ? true : false;
    }
    public static void main(String[] args) {
        int num = 153;
        System.out.println(number(num));
    }
}   
