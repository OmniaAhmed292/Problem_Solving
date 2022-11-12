//https://leetcode.com/problems/n-th-tribonacci-number/
/* 
No Recurssion Approach
*/

class Solution {
public:
    int tribonacci(int n) {
    //Corner Casses
    if(n==0)return 0;
    if(n==1)return 1;
        
    //To avoid getting out of bondary.
    int F[n+1];
    //Base Casses
    F[0]=0; F[1]=1; F[2]=1;
    
    for(int i=3; i<=n; i++){
       F[i]=F[i-1]+F[i-2]+F[i-3];
    }
    
    return F[n];
    }
};
