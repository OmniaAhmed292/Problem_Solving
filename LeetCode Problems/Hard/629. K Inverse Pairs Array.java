//https://leetcode.com/problems/k-inverse-pairs-array/

 public int kInversePairs(int n, int k) {
        int [][] dp = new int [n+1][k+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=k;j++)
            {
                for(int l=0;l<=Math.min(j,i-1);l++)
                {
                    dp[i][j]=(dp[i][j]+dp[i-1][j-l])%1000000007;
                }
            }
        }
        return dp[n][k];

    }
