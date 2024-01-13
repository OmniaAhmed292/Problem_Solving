//O(n) time, O(1) space
import static java.lang.Math.abs;

class Solution {
    public int minSteps(String s, String t) {
         int count=0;
        int [] Freqs= new int[26];
        for(int i=0; i<s.length(); i++) {
            Freqs[s.charAt(i)-'a']++;
        }
        int [] Freqt= new int[26];
        for(int i=0; i<t.length(); i++) {
            Freqt[t.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++) {

                count+= abs(Freqs[i]-Freqt[i]);
        }

        return count/2;
    }
}
