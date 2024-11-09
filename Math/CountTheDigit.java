package Math;

public class CountTheDigit {
    static int countDigit(int n) {
        int count = 0;
        int res = n;
        while(res > 0) {
            int rem = res % 10;
            res = res / 10;

            if(rem != 0 && n % 2 == 0) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int n = 12;

        int result = countDigit(n);
        System.out.print("count of Number is : "+result);
    }
}
