class Solution {
    public int lastStoneWeightII(int[] stones) {
        int ts = 0;
        for (int stone : stones) {
            ts += stone;
        }

        int target = ts / 2;
        int n = stones.length;
        
        // dp[i][j] = true if we can achieve sum j using first i stones
        boolean[][] dp = new boolean[n + 1][target + 1];
        
        // Base case: sum 0 is achievable with any number of stones
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        
        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (stones[i - 1] <= j) {
                    // Either skip or take current stone
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - stones[i - 1]];
                } else {
                    // Can't take current stone, skip it
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        // Find maximum achievable sum <= target
        int maxSum = 0;
        for (int j = target; j >= 0; j--) {
            if (dp[n][j]) {
                maxSum = j;
                break;
            }
        }
        
        return ts - 2 * maxSum;
    }
}