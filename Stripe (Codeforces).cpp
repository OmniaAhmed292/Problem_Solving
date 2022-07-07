//Problem: https://codeforces.com/contest/18/problem/C
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
//C
int main(){
    int n;
    cin>>n;
    int sum1[n]={0};
    int sum2[n]={0};
    int arr[n];
 
    for (int i=0; i<n;i++){
            cin>>arr[i]; }  //arr={5,3,4,4,5,3}
        sum1[0]=arr[0]; //sum1={5,8,12,...}
        sum2[0]=arr[n-1]; //sum2={3,8,.....}
    for(int i=1;i<n;i++){
          sum1[i]=sum1[i-1]+arr[i];
          sum2[i]=arr[n-1-i]+sum2[i-1]; }
    int counter=0;
    for (int i=0; i<n-1;i++){
        if(sum1[i]==sum2[n-2-i]) {counter++;}
        }cout<<counter<<endl;
  return 0;}
