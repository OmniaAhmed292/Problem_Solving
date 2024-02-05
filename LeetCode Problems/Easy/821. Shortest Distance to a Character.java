//https://leetcode.com/problems/shortest-distance-to-a-character/

public int[] shortestToChar(String s, char c) {
        int [] result = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                result[i]=0;
            }else{
                int left = i-1;
                int right = i+1;
                int leftDistance = Integer.MAX_VALUE;
                int rightDistance = Integer.MAX_VALUE;
                while(left>=0){
                    if(s.charAt(left)==c){
                        leftDistance = i-left;
                        break;
                    }
                    left--;
                }
                while(right<s.length()){
                    if(s.charAt(right)==c){
                        rightDistance = right-i;
                        break;
                    }
                    right++;
                }
                result[i] = Math.min(leftDistance, rightDistance);
            }
        }



        return result;
    }
