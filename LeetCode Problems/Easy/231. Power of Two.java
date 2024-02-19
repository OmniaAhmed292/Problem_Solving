//https://leetcode.com/problems/power-of-two/description/
//1
 public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
        
    }

//2
 public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        //Count of 1s in binary representation of n
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count == 1;
    }
