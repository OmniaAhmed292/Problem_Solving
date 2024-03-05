//https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends
public int minimumLength(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return right - left + 1;
            }
            while (left < right && s.charAt(left) == s.charAt(left + 1)) {
                left++;
            }
            while (left < right && s.charAt(right) == s.charAt(right - 1)) {
                right--;
            }
            left++;
            right--;
        }
        return right - left + 1<0 ? 0 : right - left + 1;
    }
