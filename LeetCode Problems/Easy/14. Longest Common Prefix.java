//https://leetcode.com/problems/longest-common-prefix/description/
//O(n^2) Time but beats 79% 

public String longestCommonPrefix(String[] strs) {
    String result=strs[0];
    for (int i = 1; i < strs.length; i++) {
        int j=0;
        while(j<result.length()&&j<strs[i].length()){
            if(result.charAt(j)!=strs[i].charAt(j))
                break;
            j++;
        }
        result=result.substring(0,j);
    }
    return result;
    }
