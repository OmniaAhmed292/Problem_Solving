//https://leetcode.com/problems/find-the-pivot-integer
//prefix solution
 public int pivotInteger(int n) {
        if(n == 1){
            return 1;
        }
        int [] prefix = new int[n];
        prefix[0] = 1;

        for(int i=1;i<n;i++){

            prefix[i] = prefix[i-1] +i+1;
        }
        for(int i=0;i<n;i++){
            if(prefix[i] == (prefix[n-1] - prefix[i]+i+1)){
                return i+1;
            }
        }

        return -1;
    }

//math solution
public int pivotInteger(int n) {
        int y = n*(n+1)/2;
        int x = (int)Math.sqrt(y);
        if(x*x==y) return x;
        else return -1;
    }
