/* https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/ */

class Solution {
public:
    int minAddToMakeValid(string s) {
          //Stack of Chars to hold elements of the String
          stack<char> stack;
        //If String is empty then it's already valid
          if(s.length()==0) return 0;
      
        for(int i=0;i<s.length();i++){
            if(s[i]=='('){
                stack.push(s[i]); 
            }
          
            else if(s[i]==')') {
                //if the closing Parentheses is the start of then put it to be count
                if(stack.empty()) stack.push(s[i]) ;
              //Matching each Parentheses with its closing
                else if(s[i]==')' && stack.top()=='('){
                    stack.pop(); 
                    
                }
              //For invalid matching add it to the stack
                else{
                     stack.push(s[i]) ;
                    }
            
            }
            
                
    }
    //What's left in the stack is the number of mismatched Parentheses which needed to be corrected
    return stack.size(); 
    }
};
