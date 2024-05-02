//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/

public int findMaxK(int[] nums) {
        int max = -1;
        int [] arr = new int[1001];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                arr[Math.abs(nums[i])]++;
            }
            if(nums[i] > 0 && arr[nums[i]]>0) {
                max = Math.max(max, nums[i]);
            }
        }
        
        return max;

    }
