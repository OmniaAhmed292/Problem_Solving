/* https://www.hackerrank.com/challenges/missing-numbers/problem */


vector<int> missingNumbers(vector<int> arr, vector<int> brr) {
    vector<int> FreqArr(100,0);
    vector<int> missing;
    int min = *min_element(brr.begin(), brr.end());
    int i=0; 
    while(i<brr.size()){
        FreqArr[brr[i]-min]++;
        if(i<arr.size()){FreqArr[arr[i]-min]--;}
        i++;
           
    }
    for(int j=0;j<FreqArr.size();j++){
        if(FreqArr[j]!=0){
        missing.push_back(j+min);
        }
    }
     
return missing;
}
