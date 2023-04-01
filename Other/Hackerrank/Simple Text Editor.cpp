/*
https://www.hackerrank.com/challenges/simple-text-editor/problem 
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;


int main() {
    //Store the String after Operations in a Stack
    stack<string> Operations;
  
    string S="";
    int Q=0; //Number of Operations
    int O=0; //Type of operation
    int k=0; //kth Element
    string C;
    cin>>Q;
    
    while(Q--){
        
        cin>>O;
        switch(O) {
            case 1:
                 cin>>C;
                //In order to not accses empty stack
                 if(Operations.empty()){
                     S="";
                 }
                else {S=Operations.top();}
                
                Operations.push(S+C);
                break;
            
            case 2:  
                cin>>k;
                S=Operations.top();
                Operations.push(S.substr(0,S.length()-k));
            break;
            
        
            case 3: 
                S=Operations.top();
                cin>>k;
                cout<<S[k-1]<<endl;
                break;
            
        
           case 4:
                Operations.pop(); 
                break; 
        
        
    } }
    return 0;
}
