//https://leetcode.com/problems/valid-sudoku/description/
/*
it takes O(n) space and O(n*n) time. 
Hope to make it better in the future 
*/

#include <set> 
class Solution {
public:
    bool isValidRC(vector<vector<char>>& board){
        set <int> Row;
        set <int> Col;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(Row.count(board[i][j])) return false;
                    Row.insert(board[i][j]);
                }
                
                if(board[j][i]!='.'){
                    if(Col.count(board[j][i]))return false;
                    Col.insert(board[j][i]);
                }

 
            }
            Row.clear();
            Col.clear();
        }
        return true;
    }

    bool isValidSquare(vector<vector<char>>& board){
        set <int> Square;
        int offsetC=0;
        int offsetR=0;
        int i=0;
        int j=0;
        while(1){
            while(1){
              if(board[offsetC+i][offsetR+j]!='.'){
                    if(Square.count(board[i+offsetC][j+offsetR])) return false;
                        Square.insert(board[i+offsetC][j+offsetR]);

                }
                //cout<<i<<" "<<j<<endl;
                //cout<<"OFF"<<offsetR<<" "<<offsetC<<endl;
                j++;
                if(j==3){
                    i++;
                    if(i==3) break;
                    j=0;
                }
                 
            }
            Square.clear();
            //cout<<"Im here";
            j=0;
            i=0;
            offsetR+=3;
                if(offsetR==9){ 
                    offsetC+=3;
                    if(offsetC==9) break;
                   
                    offsetR=0;
                }
            
        } 
        return true;
    }

    bool isValidSudoku(vector<vector<char>>& board) {
         
        
      return isValidRC(board) && isValidSquare(board);
    }
};
