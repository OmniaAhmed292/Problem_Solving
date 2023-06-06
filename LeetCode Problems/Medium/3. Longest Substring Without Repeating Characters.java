//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//Two pointers(sliding window+ Set)
public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;
    int max=0;
    int start=0; int end=1;
    Set<Character> set=new HashSet<>();
    set.add(s.charAt(start));
    while(end<s.length()){
        if(!set.contains(s.charAt(end))){
            set.add(s.charAt(end));
            end++;
        }
        else{
            set.remove(s.charAt(start));
            start++;
        }
        max=Math.max(max,end-start);
    }
    return max;
    }
