//https://leetcode.com/problems/subarray-product-less-than-k/description/

//Each step introduces x new subarrays, where x is the size of the current window (j + 1 - i);
    //example:
    //for window (5, 2), when 6 is introduced, it add 3 new subarray: (5, (2, (6)))
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        int left = 0;
        int right = 0;
        int product = 1;
        //sliding window
        while(right < n){
            product *= nums[right];
            while(product >= k && left <= right){
                product /= nums[left];
                left++;
            }
            result += right - left + 1;
            right++;
        }

        return result;

    }
