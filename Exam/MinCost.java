public class MinCost {
    static int minCost(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-1], dp[n-2]);
    }
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println("Minimum cost to reach the top is " + minCost(cost));
    }
}
