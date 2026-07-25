class Solution {
    public int coinChange(int[] a, int amount) {
        
        int n = a.length;
        int[][] dp = new int[n][amount+1];
        int maxi = 1000000;

        for(int i = 0; i <= amount ;i++){
            if(i%a[0] == 0){
                dp[0][i] = i/a[0];
            }
            else dp[0][i] = maxi;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                int nt = dp[i-1][j];
                int t = maxi;
                if(a[i] <= j){
                    t = 1 + dp[i][j-a[i]];
                }

                dp[i][j] = Math.min(nt,t);
            }
        }

        return dp[n - 1][amount] == maxi ? -1 : dp[n - 1][amount];
    }
}