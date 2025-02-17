package Practise;
import java.util.Scanner;

public class fib {
    static int fibn(int n, int[] dp) {
        if(n < 1) return n;
        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = (fibn(n - 1, dp) + fibn( n - 2, dp));
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] dp = new int[n];
        int result = fibn(n, dp);
        System.out.println(result);
    }
}
