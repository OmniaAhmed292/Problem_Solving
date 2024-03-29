//https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times
public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long result = 0;
        int left = 0;
        int right = 0;
        int maxelement = 0;
        //get max element
        for(int i = 0; i < n; i++){
            maxelement = Math.max(maxelement, nums[i]);

        }
        int cnt=0;
        while (right < n) {
            if (nums[right] == maxelement) {
                cnt++;
            }
            if (cnt >= k) {
                while (cnt >= k) {
                    result += n - right;
                    if (nums[left] == maxelement) {
                        cnt--;
                    }
                    left++;
                }
            }
            right++;
        }
        return result;
    }
