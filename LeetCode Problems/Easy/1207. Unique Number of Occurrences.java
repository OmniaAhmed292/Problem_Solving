//https://leetcode.com/problems/unique-number-of-occurrences/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int[] count = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] + 1000]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                if (set.contains(count[i])) {
                    return false;
                }
                set.add(count[i]);
            }
        }
        return true;
    }
}
