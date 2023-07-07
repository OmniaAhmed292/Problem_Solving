//https://cses.fi/problemset/task/1652

#include <iostream>
using namespace std;

int main() {
    int q;
    int n;
    cin>>n;
    cin>>q;
    int arr[n][n];
    char c;
    cin>>c;
    if(c=='*') arr[0][0]=1;
    else arr[0][0]=0;

    for(int i=0;i<n;i++){
        for (int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                if(j==0){
                    cin>>c;
                if(c=='*'){
                        arr[i][j]=1;
                }
                else arr[i][j]=0;  continue;}

                cin>>c;
                if(c=='*'){
                  arr[i][j]=arr[i][j-1]+1;
                }
                else arr[i][j]=arr[i][j-1]+0;


        }
    }

    for(int i=0;i<n;i++){
        for (int j=0;j<n;j++){
               if(i==0&&j==0) continue;
               if(i==0) continue;
               arr[i][j]=arr[i-1][j]+arr[i][j];
        }
    }
    //Solve function

    int y1,x1,y2,x2;
    while(q--){
        cin>>y1>>x1>>y2>>x2;
        x1--; y1--; x2--; y2--;
       if(x1==0 &&y1==0){
        cout<<arr[y2][x2]<<endl;
       }
      else if(x1==0){
        cout<<arr[y2][x2]-arr[y1-1][x2]<<endl;
      }
      else if(y1==0){
        cout<<arr[y2][x2]-arr[y2][x1-1]<<endl;
        }
        else {
            cout<<arr[y2][x2]-arr[y2][x1-1]-arr[y1-1][x2]+arr[y1-1][x1-1]<<endl;
        }

}

return 0;
}
