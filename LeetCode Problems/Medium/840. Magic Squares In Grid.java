//https://leetcode.com/problems/magic-squares-in-grid/submissions/
//Almost all other solutions are faster, but I belive this is readilble and can easily be generalized

class Solution {
 boolean isValid(int A[][], int n){
        int height = (int) Math.sqrt(n);
        int expected = n * (n + 1) / (2 * (int) Math.sqrt(n));
        int sum;
        Set set=new HashSet();
        // rows
        for(int i=0;i<height;i++){
            sum=0;
            for(int j=0;j<height;j++){
                if(set.contains(A[i][j])||A[i][j]>9 ||A[i][j]<=0) return false;
                sum+=A[i][j];
                set.add(A[i][j]);
            }
            //System.out.println(sum);
            if(sum!=expected) return false;
        }
        //Columns
        for(int i=0;i<height;i++){
            sum=0;
            set.clear();
            for(int j=0;j<height;j++){
                if(set.contains(A[j][i])||A[j][i]>9 ||A[j][i]<=0) return false;
                sum+=A[j][i];
                set.add(A[j][i]);
            }
            //System.out.println(sum);
            if(sum!=expected) return false;
        }
        //Diagonals
        sum=0;
        for(int i=0;i<height;i++) {
            //Main Diagonal
            sum += A[i][i];
        }
        //System.out.println(sum);
        if (sum != expected) return false;

            //Other diagonal
            sum=0;
            for(int i=0;i<height;i++){
                sum+=A[i][height-1-i];
            }
            //System.out.println(sum);
            if(sum!=expected) return false;

    return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int count=0;
        int R=grid.length;
        int C=grid[0].length;
        if(R<3|| C<3) return 0;
        else if(R==3&&C==3){
            if(isValid(grid,9)){
                count++;
            }
        }
        else{
            int startR=0; int endR=startR+3;
            int startC=0; int endC=startC+3;
            int temp[][];

            while(true){
                temp=new int[3][3];
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        temp[i][j]=grid[i+startR][j+startC];
                    }
                }
                if(isValid(temp,9)){
                    count++;
                }

                startR++;
                endR=startR+3;
                if(endR>R){
                    startR=0;
                    endR=startR+3;
                    startC++;
                    endC=startC+3;
                }
                if(endC>C) break;

            }
        }
        return count;
    }
}
