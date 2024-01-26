//https://leetcode.com/problems/longest-common-subsequence
public int longestCommonSubsequence(String text1, String text2) {
        int [][] LongestSequence=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    if(i==0||j==0){
                        LongestSequence[i][j]=1;
                    }
                    else{
                        LongestSequence[i][j]=LongestSequence[i-1][j-1]+1;
                    }
                }
                else{
                    if(i==0&&j==0){
                        LongestSequence[i][j]=0;
                    }
                    else if(i==0){
                        LongestSequence[i][j]=LongestSequence[i][j-1];
                    }
                    else if(j==0){
                        LongestSequence[i][j]=LongestSequence[i-1][j];
                    }
                    else{
                        LongestSequence[i][j]=Math.max(LongestSequence[i-1][j],LongestSequence[i][j-1]);
                    }
                }
            }
        }
        return LongestSequence[text1.length()-1][text2.length()-1];
    }
