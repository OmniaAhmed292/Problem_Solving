//https://leetcode.com/problems/minimum-window-substring/description/
import java.util.HashSet;
import java.util.Set;

public String minWindow(String s, String t) {
        int[] freqArr = new int[256];
        Set<Character> set = new HashSet<>();

        for (char c : t.toCharArray()) {
            set.add(c);
            freqArr[c]++;
        }

        int min = Integer.MAX_VALUE;
        String Final = "";
        int left = 0;
        int required = set.size();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (set.contains(currentChar)) {
                freqArr[currentChar]--;
                if (freqArr[currentChar] == 0) {
                    required--;
                }
            }

            while (required == 0) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    Final = s.substring(left, right + 1);
                }

                char leftChar = s.charAt(left);
                if (set.contains(leftChar)) {
                    freqArr[leftChar]++;
                    if (freqArr[leftChar] > 0) {
                        required++;
                    }
                }
                left++;
            }
        }

        return Final;
    }
