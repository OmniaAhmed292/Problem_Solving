//https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency

public int maxSubarrayLength(int[] nums, int maxFrequency) {
        int n = nums.length;
        int result = 0;
        int left = 0;
        int right = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(right < n){
            //add the element to the map
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            //if the frequency of the element is greater than maxFrequency, remove the element from the map
            while(map.get(nums[right]) > maxFrequency){
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;

    }
