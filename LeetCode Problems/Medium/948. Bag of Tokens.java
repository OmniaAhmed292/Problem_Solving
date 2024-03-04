//https://leetcode.com/problems/bag-of-tokens/description/
public int bagOfTokensScore(int[] tokens, int power) {
        //sort the tokens
        Arrays.sort(tokens);
        int score = 0;
        int maxScore = 0;
        int i = 0;
        int j = tokens.length - 1;
        //greedy approach
        //if power is greater than the token, then we can increase the score
        //if power is less than the token, then we can decrease the score
        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i];
                i++;
                score++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                power += tokens[j];
                j--;
                score--;
            } else {
                break;
            }
        }
        return maxScore;

    }
