//https://codeforces.com/problemset/problem/1676/E
//Using priority queue and binary search

#include <iostream>
#include <vector>
#include <queue>
using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        int q;
        cin>>n>>q;
        priority_queue<int> pq;

        for(int i=0;i<n;i++){
            int x;
            cin>>x;
            pq.push(x);
        }
        int arr[n];
        arr[0]=pq.top();
        pq.pop();
        //Compute prefix sum
         for(int i=1;i<n;i++){
            pq.top();
            arr[i]=arr[i-1]+pq.top();
            pq.pop();
        }

        while(q--){
            int k;
            cin>>k;
            int counter=1;
            if(k>arr[n-1]){cout<<-1<<endl; continue;}

            int low = 0, high = n - 1, mid, result = -1;
            while (low <= high) {
                mid = (low + high) / 2;
                if (arr[mid] >= k) {
                    result = mid+1;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                }
            cout << result << endl;
        }
}

}
