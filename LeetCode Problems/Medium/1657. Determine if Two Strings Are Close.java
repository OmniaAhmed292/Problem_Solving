
class Solution {
    public boolean closeStrings(String word1, String word2) {
    // check to see if the two words have the same length
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();

        //Check if they have the same set of chars.
        Set word1Set = new HashSet();
        Set word2Set = new HashSet();
        for (int i = 0; i < word1.length(); i++) {
            word1Set.add(word1Chars[i]);
            word2Set.add(word2Chars[i]);
        }

        if (!word1Set.equals(word2Set)) {
            return false;
        }

        // check if the two words have the same frequency for each character
        int[] word1Freq = new int[26];
        int[] word2Freq = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            word1Freq[word1.charAt(i) - 'a']++;
            word2Freq[word2.charAt(i) - 'a']++;
        }
        //Sort the frequency arrays and compare them (cuz we don't care about the order)
        Arrays.sort(word1Freq);
        Arrays.sort(word2Freq);
        for (int i = 0; i < 26; i++) {
            if (word1Freq[i] != word2Freq[i]) {
                return false;
            }
        }
        return true;
    }
}
