//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
/* Hints: 
Brute-force 
O(n^2) */ 

class Solution {
public:
    int strStr(string haystack, string needle) {
        int text=haystack.length();
        int sub= needle.length();
        for(int i=0; i<=text-sub;i++){
            int j = 0;
            while (j <text && haystack[i + j] == needle[j])
                {
                    if (j==sub-1) return i;
                    j++;
 
                }
                         
            }
        return -1;
     
    }
};
