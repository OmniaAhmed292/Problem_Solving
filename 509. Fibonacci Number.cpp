//https://leetcode.com/problems/fibonacci-number/

class Solution {
public:
    int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        int F[n+1];
        F[0]= 0;
        F[1]= 1;
        for(int i=2;i<=n;i++){
            F[i]=F[i-1] + F[i-2];
            
        }
        return F[n];   
    }
};
