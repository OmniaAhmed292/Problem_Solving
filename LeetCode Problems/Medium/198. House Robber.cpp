//https://leetcode.com/problems/house-robber/description/
//#Dynamic Programming

class Solution {
public:
    int rob(vector<int>& nums) {
        vector<int> cost(nums.size(),0);
        if(nums.size()==1) return nums[0];
        cost[0]=nums[0];
        cost[1]=max(nums[0],nums[1]);
        if(nums.size()<3) return max(cost[0],cost[1]);

        for(int i=2;i<nums.size();i++){
            cost[i]=max(nums[i]+ cost[i-2], cost[i-1]);
        }
    return cost[nums.size()-1];
    }
};
