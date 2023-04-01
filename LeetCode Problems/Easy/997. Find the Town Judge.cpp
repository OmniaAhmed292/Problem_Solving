//https://leetcode.com/problems/find-the-town-judge/description/?envType=study-plan&id=data-structure-ii


/*
Easy code, uses Frequency array
Better approach is to use in and out degrees but here I only use one vector for both.
*/

class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
      vector<int> freqarr(n+1,0);
      for(int i=0;i<trust.size();i++){
          freqarr[trust[i][0]]--;
          freqarr[trust[i][1]]++;
          
      }
      for(int j=1;j<=n;j++){
          if(freqarr[j]==n-1) return j;
      }
      return -1;
    }
};
