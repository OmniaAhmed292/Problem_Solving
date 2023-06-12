//https://leetcode.com/problems/climbing-stairs/description/
//Dynamic programming 
//The intersting thing is: after the execution, you will actually get the Fibonacci sequence! (Each number is the sum of the two preceding ones, starting from 0 and 1)

//dp is initialized to 46 because the test cases are up to 45.
int [] dp= new int[46];
    public int climbStairs(int n) {
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=0) return dp[n];
        dp[n] = climbStairs(n-1)+climbStairs(n-2);
        return dp[n];
    }
