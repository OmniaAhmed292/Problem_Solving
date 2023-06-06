//https://leetcode.com/problems/maximum-subarray/description/
//dp solution: O(n) time and space 
//can be solved without the extra array of space!
class Solution {
   public int maxSubArray(int[] nums) {
    int [] result=new int[nums.length];
    int max=nums[0];
    result[0]=nums[0];
    for(int i=1;i<nums.length;i++) {
        result[i] = Math.max(nums[i], result[i - 1] + nums[i]);
        if (result[i] > max) {
            max = result[i];
        }
    }
    return max;
    }
}
