//https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        int Area, maxArea = 0;
        //index of first length
        int L1 = 0;
        //index of second length
        int L2 = height.length-1;

        while(L1 < L2){
            
            if(height[L1] < height[L2]){

                Area =height[L1] * (L2-L1);
                if(Area>maxArea) maxArea=Area;
                L1++;

            }else{
                Area =height[L2] * (L2-L1);
                if(Area>maxArea) maxArea=Area;
                L2--;
            }
        }

        return maxArea; 
        } 
        }
