//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/*/

class Solution {
public:
  
    string removeDuplicates(string s) {
      //Treating a string like a stack
        string stack;
        for(int i=0;i<s.length();i++){
          
            if(stack.empty()){stack.push_back(s[i]);}
          
            else if(stack.back()==s[i]){stack.pop_back();}
          
            else{stack.push_back(s[i]);
                                  }
        }
        
        return stack;
    }
};
