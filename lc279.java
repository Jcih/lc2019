class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int i = 0; i <= n; i++) {
            int j = 1;
            while ( i - j*j >= 0) {
                dp[i] = Math.min(dp[i - j*j] + 1, dp[i]);
                j++;
            }
        }
        return dp[n];
    }
}