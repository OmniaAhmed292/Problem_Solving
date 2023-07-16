//https://codeforces.com/problemset/problem/1452/C

include <iostream>
#include <stack>

#define ISO ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define ll long long
using namespace std;

int n;
queue <int> v;
ll number;

int isValid(string s) {
        //Stack of Chars to hold elements of the String
        stack<char> stack1;
        stack <char> stack2;
        int cnt=0;

        for(int i=0;i<s.length();i++){
            if(s[i]=='('){
                stack1.push(s[i]);
            }
            else if(s[i]==')') {
                //if the closing Parentheses is the start of the string return false
                if(stack1.empty()) stack1.push(s[i]);
              //Matching each Parentheses with its closing
                else if(s[i]==')' && stack1.top()=='('){
                    stack1.pop();
                    cnt++;
                }

              //For invalid matching
                else{
                    stack1.push(s[i]);
                    }

            }
            //For ? inputs
            else{
                    if(s[i]=='['){
                        stack2.push(s[i]);
                     }
                    else if(s[i]==']') {
                        if(stack2.empty()) stack2.push(s[i]);
                        else if(s[i]==']' && stack2.top()=='['){
                            stack2.pop();
                            cnt++;
                        }

                    //For invalid matching
                    else{
                    stack2.push(s[i]);
                    }

                }
        } }

return cnt;
}

void solve(){
    ISO
    string s;
    cin>>s;
    int cnt=isValid(s);
    cout<<cnt<<"\n";
}

int main(){
 int t=1;
 cin>>t;
 while(t--){
    solve();
 }
 }
