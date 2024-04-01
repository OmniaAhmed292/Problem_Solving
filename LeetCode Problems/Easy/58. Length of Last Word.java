//https://leetcode.com/problems/length-of-last-word/
public int lengthOfLastWord(String s) {
        int n = s.length();
        int result = 0;
        int i = n - 1;
        //skip the trailing spaces
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            result++;
            i--;
        }
        return result;

    }
