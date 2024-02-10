//https://leetcode.com/problems/longest-palindromic-substring/description/
public String longestPalindrome(String s) {
//dp[i][j] is true if the string from index i to j is a palindrome
        boolean[][] dp = new boolean[s.length()][s.length()];
        String res="";

        //Every single character is a palindrome
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        //Every two consecutive characters are a palindrome
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
            }
        }

        //Every string of length 3 or more
        //If the first and last characters are the same and the string in between is a palindrome
        for (int len = 3; len <= s.length(); len++) {
            for (int i = 0; i < s.length() - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }
        //Find the longest palindrome
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(dp[i][j]){
                    if(j-i+1>res.length()){
                        res=s.substring(i,j+1);
                    }
                }
            }
        }
     return res;   
    }
