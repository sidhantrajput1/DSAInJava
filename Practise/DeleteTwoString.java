package Practise;

public class DeleteTwoString {
    static int minDistance(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        int[][] dp = new int[w1.length + 1][w2.length + 1];
        for (int i = 1; i <= w1.length; i++) {
            for (int j = 1; j <= w2.length; j++) {
                if (w1[i - 1] == w2[j - 1])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        int common = dp[w1.length][w2.length];
        return w1.length  + w2.length - 2 * common;
    }
    public static void main(String[] args) {
        String str1 = "sea";
        String str2 = "eat";
        int result = minDistance(str1, str2);
        System.out.println(result);
    }
}
