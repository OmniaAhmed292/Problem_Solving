//https://leetcode.com/problems/minimum-falling-path-sum

public int minFallingPathSum(int[][] matrix) {
        int sum = Integer.MAX_VALUE;
        int[][] MinSumTillNow = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0) {
                    MinSumTillNow[i][j] = matrix[i][j];
                } else {
                    int one = Integer.MAX_VALUE;
                    int Two = Integer.MAX_VALUE;
                    int Three;

                    if (j - 1 >= 0) {
                        one = MinSumTillNow[i - 1][j - 1];
                    }
                    if (j + 1 < matrix.length) {
                        Two = MinSumTillNow[i - 1][j + 1];
                    }
                    Three = MinSumTillNow[i - 1][j];
                    MinSumTillNow[i][j] = Math.min(Math.min(one, Two), Three) + matrix[i][j];
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (MinSumTillNow[matrix.length - 1][i] < sum) {
                sum = MinSumTillNow[matrix.length - 1][i];
            }
        }
        return sum;
    }
