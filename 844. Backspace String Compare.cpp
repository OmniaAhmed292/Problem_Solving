/* https://leetcode.com/problems/backspace-string-compare/ */

class Solution {
public:
    bool backspaceCompare(string s, string t) {
          stack<char> stack;
      //Store first string in the stack
        for(int i=0;i<s.length();i++){
           //if we find back space then pop the last element;
            if(s[i]=='#'){
                if(stack.empty()) continue;
                stack.pop();
            }   
            else{
                //Push rest of the elements in the stack
                stack.push(s[i]);
            }
        }
      //Start of comparison
        //Count the number of backspacing
        int BackCount=0;
        for(int i=t.length()-1;i>=0;i--){
            if(t[i]=='#'){
                BackCount++;
                continue;
            }
            else{ 
                //if the current element is not BackSpace we should delete the same numeber of  backspaced elements. 
                if(BackCount){
                    BackCount--; 
                    continue;    
                }
                //If stack is empty and the string is not then they are not equal.
                else if(stack.empty())return false;
                //if the elements are not equal
                else if(stack.top()!=t[i]) {return false;}
               // if they are equal remove it from stack
                else{
                        stack.pop(); 
                }
            }
            
        
    }
       // if the stack is not empty after the string is then the string is smaller and they are not equal.
        return stack.empty();
    }
   
    
};
