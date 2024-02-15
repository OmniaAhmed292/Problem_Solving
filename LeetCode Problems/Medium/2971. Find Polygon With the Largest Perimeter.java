//https://leetcode.com/problems/find-polygon-with-the-largest-perimeter

 public long largestPerimeter(int[] nums) {
        int num=nums.length;
        long Tot=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            Tot+= (long) nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i]>=Tot-nums[i]) {
                num--;
            }
            else break;
            Tot=Tot-(long)nums[i];
        }

        long sum=0;
        for(int i=num-1;i>=0;i--){
            sum+=nums[i];
        }
    return sum>0? sum:-1;
    }
