//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//Dynamic Programming solution O(n) time and space complexity
class Solution {
public int maxProfit(int[] prices) {
        int res=0;
        //dp[i] represents the maximum profit that can be obtained by selling the stock on day i.
        int[] dp=new int[prices.length];
        dp[0]=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i]=Math.max(dp[i-1],prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return dp[dp.length-1];
    }
   
}
