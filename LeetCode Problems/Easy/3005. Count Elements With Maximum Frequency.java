//https://leetcode.com/problems/count-elements-with-maximum-frequency/
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
