//https://leetcode.com/problems/reverse-string/
/*
1) Non recursive method
*/
class Solution {
public:
    void reverseString(vector<char>& s) {
        stack  <char> Stack;
  for(int i=0;i<s.size();i++){
      Stack.push(s[i]);
      
  }
 for(int i=0;i<s.size();i++){
      s[i]=Stack.top();
     Stack.pop();
      
  }
 
    
        
    }
};
//ـــــــــــــــــــــــــــــــــــــــــــــــــ

/* 
2) Recursive method
*/

