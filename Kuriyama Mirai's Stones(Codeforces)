//Problem: https://codeforces.com/contest/433/problem/B

#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    long int n;
    cin>>n;
   long long int arr[100005]={0};
   long long int arrS[100005]={0};
    long long int sumArr[100005]={0};
   long long int sumArrS[100005]={0};
    for (int i = 0; i < n; ++i){
            cin>>arr[i];
            arrS[i]=arr[i];
            if(i==0)sumArr[i]=arr[i];
            else sumArr[i]=arr[i]+sumArr[i-1];
    }
 
    sort(arrS, arrS + n);
 
    for(int i=0;i<n;i++){
         if(i==0)sumArrS[i]=arrS[i];
        else sumArrS[i]=arrS[i]+sumArrS[i-1];
            //cout<<arr[i]<<" "<<arrS[i]<<" ";
            //cout<<sumArr[i]<<" "<<sumArrS[i]<<endl;
        }
   int m;
    cin>>m;
    int type, s, l;
    for(int i=0;i<m;i++){
    cin>>type>>s>>l;
    if (type==1){ if(s==1) cout<<sumArr[l-1]<<endl;
           else cout<<sumArr[l-1]-sumArr[s-2]<<endl;}
 
    else if(type==2){ if(s==1) cout<<sumArrS[l-1]<<endl;
           else cout<<sumArrS[l-1]-sumArrS[s-2]<<endl;}
}
 
 
 
return 0;
}
