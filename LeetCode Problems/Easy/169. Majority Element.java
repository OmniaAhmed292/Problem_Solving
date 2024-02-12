//O(nlogn) time O(1) space

public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
//Moore voting algorithm
//O(n) time O(1) space

public int majorityElement(int[] nums) {
       int count=0;
       int candidate=0;
       for(int num :nums){
           if(count==0) candidate=num;
           if(num==candidate) count++;
           else count--;
       }
       return candidate; 
    }
