//https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

class Solution {
public:
int findsmall(vector<int>& nums) {
    int s=nums[0];
    for(int i=1;i<nums.size();i++){
        if(s>nums[i]) s=nums[i];
        }
    return s;
    }
int findbig(vector<int>& nums) {
    int big=nums[0];
   for(int i=1;i<nums.size();i++){
        if(big<nums[i]) big=nums[i];
        }
    return big;
    }

//The important part of GCD computing.
    int GCD(int b,int s)
    {
        if(s==0) return b;
        if(s==1) return 1;
        return GCD(s,(int)b%s);
    }

    int findGCD(vector<int>& nums) {
        int s=findsmall(nums);
        int b=findbig(nums);
        return GCD(b,s);
        
    }
};
