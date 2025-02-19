//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        int patternInd=0;
        while(patternInd< patterns.length){
                if(word.contains(patterns[patternInd])) {count++;}
                patternInd++;
        }
    return count;
    }
