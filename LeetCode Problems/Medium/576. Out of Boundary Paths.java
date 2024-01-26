//https://leetcode.com/problems/out-of-boundary-paths/

public int dfs(int row, int col,int moves, int m, int n,int[][][] dp){
        if(row<0 || row==m) return 1;
        if(col<0 || col==n) return 1;
        if (moves==0) return 0;
        if(dp[row][col][moves]!=-1) return dp[row][col][moves];


        dp[row][col][moves]=
                ((dfs(row+1, col, moves-1, m,n,dp)
                +dfs(row-1, col,moves-1,m,n,dp))%1000000007
                +(dfs(row, col-1,moves-1,m,n,dp)
                +dfs(row, col+1,moves-1,m,n,dp))%1000000007) %1000000007;


        return dp[row][col][moves];
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
       int[][][] dp = new int[m][n][maxMove+1];
       for(int i=0;i<m;i++)
           for(int j=0;j<n;j++)
               Arrays.fill(dp[i][j],-1);

       return dfs(startRow,startColumn,maxMove,m,n,dp)%1000000007;

    }
