//Using Hash Set 
class Solution {
    public int longestPalindrome(String s) {
    int length = 0;
    HashSet<Character> hset = new HashSet<Character>();
        for (int i = 0; i< s.length(); i++) {
        char character = s.charAt(i);
        if (hset.contains(character)) {
            length += 2;
            hset.remove(character);
        }
        else {
            hset.add(character);
        }
    }
        if (hset.size() > 0) {
        length ++;
    }
        return length;
}
}

//Using Frequency Array and separate count char function (slower)
class Solution {
    int countChars(String A, char c, int start, int end){
        if (start == end){
            if (A.charAt(start) == c){
                return 1;
            }
            return 0;
        }
        int mid = start + (end - start) / 2;
        return countChars(A, c, start, mid) + countChars(A, c, mid + 1, end);
    }
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        int [] freq = new int[60];
        int count;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            count = countChars(s, c, 0, s.length() - 1);
            //System.out.println(c + " " + count);
            freq[c - 'A'] = count;
            }
        boolean alreadyExecuted = false;

        int res = 0;
        for(int i=0;i<freq.length;i++){
            if(freq[i] % 2 == 0){
                res += freq[i];
            }else{
                if(freq[i] > 1) res += freq[i] - 1;
                 if(!alreadyExecuted) {
                        res += 1;
                    alreadyExecuted = true;
                }

            }
        }
        return res;}
}
