//https://leetcode.com/problems/missing-number/
public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

   public int missingNumber(int[] nums) {
        int realSum = nums.length * (nums.length+1)/2;
        int Sum=0;
        for(int i=0;i<nums.length;i++){
            Sum+=nums[i];
        }
        return realSum-Sum;

    }
