/* https://leetcode.com/problems/backspace-string-compare/ 

There's two approaches one using one stack and the other using two stacks.

*/

// Approach with only one stack
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



//Approach with two stacks
class Solution {
public:
    bool backspaceCompare(string s, string t) {
          stack<char> stack1;
          stack<char> stack2;
        for(int i=0;i<s.length();i++){
            if(s[i]=='#'){
                if(stack1.empty()) continue;
                stack1.pop();
            }   
            else{
                stack1.push(s[i]);
            }
        }
        for(int i=0;i<t.length();i++){
            if(t[i]=='#'){
                if(stack2.empty()) continue;
                stack2.pop();
            }   
            else{
                stack2.push(t[i]);
            }
        }
        while(true){
            if(stack1.empty()||stack2.empty()) break;
            if(stack1.top()!=stack2.top()) return false;
            stack1.pop();
            stack2.pop();
            
        }
        
        
       return stack2.empty()&&stack1.empty();
        
    }
   
    
};
