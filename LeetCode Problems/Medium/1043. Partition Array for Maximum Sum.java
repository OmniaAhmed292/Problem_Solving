https://leetcode.com/problems/partition-array-for-maximum-sum

public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 1; j <= k && i - j + 1 >= 0; j++) {
                max = Math.max(max, arr[i - j + 1]);
                if(i>=j){
                    dp[i] = Math.max(dp[i], dp[i - j] + max * j);
                }
                else {
                    dp[i] = Math.max(dp[i], max * j);
                }
            }
        }
        return dp[n - 1];
        
    }
