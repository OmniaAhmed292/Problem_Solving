//https://leetcode.com/problems/cheapest-flights-within-k-stops/description/

//DFS+ DP solution
public int dfs(int dp[][], int src, int dst, int k, int n, int[][] flights){
        if(k <0){
            return -1;
        }
        if(src == dst){
            return 0;
        }
        if(dp[src][k] != 0){
            return dp[src][k];
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < flights.length; i++){
            if(flights[i][0] == src){
                int temp = dfs(dp, flights[i][1], dst, k-1, n, flights);
                if(temp != -1){
                    min = Math.min(min, temp + flights[i][2]);
                }
            }
        }

        dp[src][k] = min == Integer.MAX_VALUE ? -1 : min;
        return dp[src][k];
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dp[][] = new int[n][k+2];
        int ans = dfs(dp, src, dst, k+1, n, flights);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
