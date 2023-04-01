//https://leetcode.com/problems/fibonacci-number/

/* 
No recurrsion solution
*/

class Solution {
public:
    int fib(int n) {
        //Corner Casses
        if(n==0) return 0;
        if(n==1) return 1;
        //Array with index+1 to avoid out of boundarying.
        int F[n+1];
        //Base Casses;
        F[0]= 0;
        F[1]= 1;
        for(int i=2;i<=n;i++){
            F[i]=F[i-1] + F[i-2];
            
        }
        return F[n];   
    }
};
