class Solution {
    public int numSquares(int n) {
        int c = 0;
        int a = (int)Math.sqrt(n);
        int[][] dp = new int[a+1][n+1];

        for(int i=0;i<=n;i++){
            dp[0][i] = i;
        }

        for(int i=1;i<=a;i++){
            for(int j=1;j<=n;j++){

                dp[i][j] = dp[i-1][j];
                if(i*i<=j){
                    dp[i][j] = Math.min(dp[i][j], 1 + dp[i][j-i*i]);
                }
            }
        }

        return dp[a][n];

        
    }
}