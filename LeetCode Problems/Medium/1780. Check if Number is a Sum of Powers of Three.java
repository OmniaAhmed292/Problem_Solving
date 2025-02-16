//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
//For a number to be a sum of powers of n, it sould only contains 0 or 1s in the n-representation of the number

 public boolean checkPowersOfThree(int n) {
        int r;
        while(n>0){
           r = n % 3;
           n /= 3;
           if(r>1) return false;
        }

    return true;
    }
