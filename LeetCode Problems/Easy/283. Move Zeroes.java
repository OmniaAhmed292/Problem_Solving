//https://leetcode.com/problems/move-zeroes
public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while(j < n){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while(i < n){
            nums[i] = 0;
            i++;
        }
        return;
    }
