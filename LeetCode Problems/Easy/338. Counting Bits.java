//https://leetcode.com/problems/counting-bits/description/
public int[] countBits(int n) {
        int result[]=new int[n+1];
        for(int i=0;i<=n;i++){
            result[i]=result[i/2]+i%2;
        }
        return result;
    }
