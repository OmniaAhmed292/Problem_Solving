/* https://leetcode.com/problems/removing-stars-from-a-string/ */ 

class Solution {
public:
    string removeStars(string s) { 
         //Using string as a stack
           string stack;    
        for(int i=0;i<s.length();i++){
            if(s[i]=='*'){
                if(stack.empty()) continue;
                stack.pop_back();
               
            }   
            else{
                //Push rest of the elements in the stack
                stack.push_back(s[i]);
                
            }
        }
     
    
        
    return stack;}   
};
