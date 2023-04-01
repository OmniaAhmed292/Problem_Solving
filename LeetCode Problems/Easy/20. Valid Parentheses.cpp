/* https://leetcode.com/problems/valid-parentheses/submissions/ 
Faster than 100% :D
*/

class Solution {
public:
    bool isValid(string s) {
        //Stack of Chars to hold elements of the String
        stack<char> stack;
      
        for(int i=0;i<s.length();i++){
            if(s[i]=='(' || s[i]=='{' || s[i]== '[' ){
                stack.push(s[i]); 
            }
            else if(s[i]==')' ||s[i]=='}' ||s[i]==']') {
                //if the closing Parentheses is the start of the string return false
                if(stack.empty()) return false;
              //Matching each Parentheses with its closing
                else if(s[i]==')' && stack.top()=='('){
                    stack.pop(); 
                    
                }
                else if(s[i]=='}' && stack.top()=='{'){
                    stack.pop(); 
                }
                else if(s[i]==']' && stack.top()=='['){
                    stack.pop(); 
                }
              //For invalid matching
                else{
                    
                    return false;}
            
            }
            //For invalid inputs
            else {
                return false;}
                
        

            
}
//Return the condition of the stack because maybe some Parentheses aren't closed yet
return stack.empty();
 }
};
