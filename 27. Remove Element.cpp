//https://leetcode.com/problems/remove-element/

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
         int size=nums.size();
    for(int i=0; i<size; i++){
      if(nums[i] == val) {
          for ( int j=i ;j<size-1; j++)
          {nums[ j ] = nums[j+1];}
          size--;
          i--;
          
      }
       
    }
    return size;
    }
};
