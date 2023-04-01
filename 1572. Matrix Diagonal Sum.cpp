//https://leetcode.com/problems/matrix-diagonal-sum/description/

/* O(n) time and O(1) space complexity 
it depends on fact that main diagonal where row=col and seconday digonal is where row+col=size-1 */

class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int sum=0;
        int n=mat[0].size();
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i]+mat[i][n-1-i];
        }
        if(n%2==1) sum=sum-mat[n/2][n/2];
        return sum;

    }
};
