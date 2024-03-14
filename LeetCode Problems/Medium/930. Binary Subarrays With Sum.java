//https://leetcode.com/problems/binary-subarrays-with-sum/
//prefix sum with hashmaps

public int numSubarraysWithSum(int[] nums, int k) {
        int count = 0;
        HashMap prefix=new HashMap<>();
        int sum = 0;
        prefix.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (prefix.containsKey(sum - k)) {
                count += (int)prefix.get(sum - k);
            }
            prefix.put(sum, (int)prefix.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
