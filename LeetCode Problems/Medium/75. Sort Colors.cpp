//https://leetcode.com/problems/sort-colors/

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

//Follow up: Could you come up with a one-pass algorithm using only constant extra space? 
/* Three pointers approach one pass */ 

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int right=nums.size()-1;
        int left= 0;
        int i=0;
        while(i<=right){
            if(nums[i]==2){
                std::swap(nums[right],nums[i]);
                right--;
                //if we swapped to the right we might need to swap to left again so can't increase pointer
                continue;
            }
            else if(nums[i]==0){
                std::swap(nums[left],nums[i]);
                left++;
            }
            i++;
            
        }
    }
};
