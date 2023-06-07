//https://leetcode.com/problems/sqrtx/description/
//Binary search O(log(n)) //Be aware of Integer overflow in test casses

 class Solution {
  public int mySqrt(int x) {
        if (x==0 || x==1) return x;
        int start = 0;
        int end = x/2;
        int result=0;
        while (start<=end){
            int mid=(start+end) / 2;
            if(mid==0){
                return 1;
            }
            if (x/mid==mid){
                return mid;
            }
            if (x/mid>mid){
                start= (int) (mid+1);
                result = mid;
            }
            else{
                end= (int) (mid-1);
            }
        }
        return result;
    }
}
