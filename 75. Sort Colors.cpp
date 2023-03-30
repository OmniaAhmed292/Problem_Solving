//https://leetcode.com/problems/sort-colors/description/
/* keys: bubble sort/ brute-force */ 

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int t=0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]>nums[i+1]){
                t=i+1;
                while(t>0 && nums[t]<nums[t-1]){
                    std::swap(nums[t-1],nums[t]);
                    t=t-1; 
                }

            }
        }
        
    }
};
