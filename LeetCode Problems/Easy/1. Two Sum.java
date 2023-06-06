//https://leetcode.com/problems/two-sum/description/

//Two pointers Approach
class Solution {
   public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int right=0;
        int left=nums.length-1;
        while(nums[right]+nums[left]!=target){
                left--;
                if(left==right){
                    right++;
                    left=nums.length-1;
                }
        }
        result[0]=right;
        result[1]=left;
    return result;
    }
}
