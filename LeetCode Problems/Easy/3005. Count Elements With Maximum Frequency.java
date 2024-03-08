//https://leetcode.com/problems/count-elements-with-maximum-frequency/

// One pass solution
 public int maxFrequencyElements(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int CountofMaxFreq = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > maxFreq) {
                maxFreq = map.get(num);
                CountofMaxFreq = 1;
            }
            else if (map.get(num) == maxFreq) {
                CountofMaxFreq++;
            }
        }

        return CountofMaxFreq*maxFreq;
    }

//Two pass solution
public int maxFrequencyElements(int[] nums) {
        int [] freqArr = new int[100000];
        for(int i = 0; i < nums.length; i++) {
            freqArr[nums[i]]++;
        }
        Arrays.sort(freqArr);
        //return max frequency*its elements
        int maxFreq = freqArr[freqArr.length-1];
        int res=0;
        for(int i = freqArr.length-1; i >= 0; i--) {
            if (freqArr[i] == maxFreq) {
                res += maxFreq;
            } else {
                break;
            }
        }
        return res;
    }
