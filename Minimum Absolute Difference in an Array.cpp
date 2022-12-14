/* https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
*/

int minimumAbsoluteDifference(vector<int> arr) {
    int n = arr.size();
    //Sorting the vector
    sort(arr.begin(), arr.end());
    //Initialize min with the abslute difference between first two elements
    int min=abs(arr[0]-arr[1]);
  
    //Iterate over the array and find the min difference between any two adjacent numbers
    //(After sorting the min difference must be in them)
    for(int i=1;i<n-1;i++){
        int sum=0;
        sum= abs(arr[i]-arr[i+1]);
        if(sum<min) min=sum;
    }
    return min;

}
