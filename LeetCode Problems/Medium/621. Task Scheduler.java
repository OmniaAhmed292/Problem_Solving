//https://leetcode.com/problems/task-scheduler/
class Solution {
    public int leastInterval(char[] tasks, int n) {
        // 1. count the frequency of each task
        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        // 2. sort the frequency array
        Arrays.sort(freq);
        int maxFreq = freq[25];
        //3. Create a frame with the most frequent task in the middle
        int idleTime = (maxFreq - 1) * n;
        //4. fill the frame with the rest of the tasks in descending order hence the idle time will be reduced
        for (int i = 24; i >= 0; i--) {
            idleTime -= Math.min(maxFreq - 1, freq[i]);
        }
        //5. if the idle time is less than or equal 0, then return the length of the tasks array
        return idleTime > 0 ? idleTime + tasks.length : tasks.length;

    }
}
