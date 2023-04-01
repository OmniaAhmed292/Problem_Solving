//https://leetcode.com/problems/n-queens/

#include <set> 
class Solution {
public:
vector<vector<string>> res;
        set <int> col;
        set <int> posD;
        set <int> negD;
        vector<vector<string>>board;

     void backtrack(int row,int n){
        
        //If we finished the board
        if(row==n){
            string s="";
            vector<string> copy;
            for(int c=0;c<n;c++){
               for(int r=0;r<n;r++){
                s=s+board[c][r];

                }
                copy.push_back(s);
                s="";
            }
            //Add the result to the set of resulats
            res.push_back(copy);
            return;
        }

        for(int c=0;c<n;c++){
            if(col.count(c)||posD.count(row+c)||negD.count(row-c)) continue;
        //Update sets
        col.insert(c);
        posD.insert(row+c);
        negD.insert(row-c);
        board[row][c]="Q";

        backtrack(row+1,n);
        //Clean
         col.erase(c);
        posD.erase(row+c);
        negD.erase(row-c);
        board[row][c]=".";
        }}



    vector<vector<string>> solveNQueens(int n) {
       // if(n==1) return [["Q"]]; 
        //initialize the board
        
        vector<string> r(n,".");
        vector<vector<string>>b(n,r);

        board=b;

     backtrack(0,n); 
    return res;
    
    }

};
