//https://leetcode.com/problems/insert-interval/

public int[][] insert(int[][] intervals, int[] newInterval) {
        int [] [] res = new int[intervals.length+1][2];
        int i = 0;
        int j = 0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            res[j++] = intervals[i++];
        }
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res[j++] = newInterval;
        while(i<intervals.length){
            res[j++] = intervals[i++];
        }
        return Arrays.copyOf(res,j);
    }
