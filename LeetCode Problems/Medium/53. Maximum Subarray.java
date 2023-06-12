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

//Divide and Conquer solution 
//O(nlog(n)) Time

static int maxCrossingSum(int arr[], int start, int mid, int end){
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = mid; i >= start; i--)
        {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= end; i++)
        {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }
        return left_sum + right_sum;
    }
    public int maxSubArraySE(int[] nums, int start, int end) {
        if(start>end) return Integer.MIN_VALUE;
        if(start==end) return nums[start];
        int mid = (start+end)/2;
        /* Return maximum of:
        a) Maximum subarray sum in left half
        b) Maximum subarray sum in right half
        c) Maximum subarray sum such that the
        subarray crosses the midpoint */
        return Math.max(Math.max(maxSubArraySE(nums,start,mid),maxSubArraySE(nums,mid+1,end)),maxCrossingSum(nums,start,mid,end));

    }
    public int maxSubArray(int[] nums) {
        return maxSubArraySE(nums,0,nums.length-1);
    }
