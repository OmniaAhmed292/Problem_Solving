//https://leetcode.com/problems/single-number/
//O(1) space, O(n) time
//two equal numbers xored = 0

  public int singleNumber(int[] nums) {
        int answer=0;
        for (int num : nums) {
            answer = answer ^ num;

        }
        return answer;

    }

