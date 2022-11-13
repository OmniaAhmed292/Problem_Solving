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
//Hacker rank question
/* 
2) Recursive method
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

string reverse_string(string s,int n)
{
if ((s.length()  <= 1)) {
            return s;
        }
        string reversed = reverse_string(s.substr(1),n-1) + s.at(0);
        return reversed;
    
}

int main() {
    string s;
  	cin>>s;
  	cout<<reverse_string(s,s.length())<<endl;
    return 0;
}
