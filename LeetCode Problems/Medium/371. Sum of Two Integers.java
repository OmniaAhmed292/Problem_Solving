 //https://leetcode.com/problems/sum-of-two-integers/description/
 //using bit manipulation
 
 public int getSum(int a, int b) {
        int xor=a^b;
        int c=a&b;
        while(c!=0){
            c<<=1;
            int temp=xor^c;
            c=xor&c;
            xor=temp;
        }
    return xor;
    }
