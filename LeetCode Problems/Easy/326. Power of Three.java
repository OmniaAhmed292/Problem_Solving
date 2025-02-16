//https://leetcode.com/problems/power-of-three/

public boolean isPowerOfThree(int n) {
        if(n<3) return false;
        int r;
        while(n>1){
           r = n % 3;
           n /= 3;
           if(r!=0) return false;
        }

      return true;
  }


 public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n%3 == 0){
            n /= 3;
        }
        return n == 1;
    }

