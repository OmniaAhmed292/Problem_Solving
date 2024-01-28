//https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/

public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int [] [] sum = new int [matrix.length+1][matrix[0].length+1];
        for(int i=1;i<=matrix.length;i++)
        {
            for(int j=1;j<=matrix[0].length;j++)
            {
                sum[i][j]=sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+matrix[i-1][j-1];

            }
        }
        int count=0;
        for(int i=1;i<=matrix.length;i++)
        {
            for(int j=1;j<=matrix[0].length;j++)
            {
                for(int k=1;k<=i;k++)
                {
                    for(int l=1;l<=j;l++)
                    {
                        if(sum[i][j]-sum[i][l-1]-sum[k-1][j]+sum[k-1][l-1]==target)
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
