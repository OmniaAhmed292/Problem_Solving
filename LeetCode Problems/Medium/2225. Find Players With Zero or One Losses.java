class Solution {
     public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> Result=new ArrayList<>();
        int[]FreqWin=new int[100001];
        int[]FreqLose=new int[100001];
        for(int i=0;i<matches.length;i++){
            FreqWin[matches[i][0]]++;
            FreqLose[matches[i][1]]++;
        }
        List<Integer> winners = new ArrayList<>();
        List<Integer> Losers = new ArrayList<>();
        for(int i=0;i<100001;i++){

            if(FreqWin[i]>0 && FreqLose[i]==0){
               winners.add(i);
            }
            if(FreqLose[i]==1){
               Losers.add(i);
            }
        }
        Result.add(winners);
        Result.add(Losers);
        return Result;
    }
}
