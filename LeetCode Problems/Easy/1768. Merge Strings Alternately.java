//https://leetcode.com/problems/merge-strings-alternately

    public String mergeAlternately(String word1, String word2) {
        String answer = "";
        int s1 =0, s2=0;
        while(s1<word1.length() || s2<word2.length()){
            if(s1<word1.length()){
                answer+=word1.charAt(s1);
                s1++;
            }
            if(s2<word2.length()){
                answer+=word2.charAt(s2);
                s2++;
            }
        }
        return answer;
    }
