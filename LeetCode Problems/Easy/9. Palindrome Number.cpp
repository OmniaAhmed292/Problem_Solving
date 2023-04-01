//https://leetcode.com/problems/palindrome-number/description//
#include <vector>
class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        long n=x;
        vector<int> num;
        while(n>0){
        num.push_back(n%10);
          n=n/10;
        }
      for(int i=0;i<num.size()/2;i++)
      {if(num[i]!=num[(num.size())-1-i]) return false;
      } 

    return true;
        
    }
};
