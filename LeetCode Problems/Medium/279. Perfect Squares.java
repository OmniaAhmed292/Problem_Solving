import java.util.*;
import static java.lang.Math.min;

class Solution {
   static int count(List<Integer> squares, int n, int sum, int dp[][]) {
        if (sum == 0) {
            return 0;
        }
        if (n == 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[n][sum] != 0) {
            return dp[n][sum];
        }
        if (squares.get(n - 1) <= sum) {
            return dp[n][sum] = min(1 + count(squares, n, sum - squares.get(n - 1), dp), count(squares, n - 1, sum, dp));
        } else {
            return dp[n][sum] = count(squares, n - 1, sum, dp);
        }

    }

    public int numSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
           squares.add(i * i);
        }
        int dp [][] = new int[squares.size()+1][n+1];
        return count(squares,squares.size(), n, dp);
    }
}
