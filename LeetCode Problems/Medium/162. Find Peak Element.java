//Problem: https://leetcode.com/problems/find-peak-element/
class Solution {
   public static int findPeakElement(int[] nums) {
        //Get the middle start, middle and end indexes.
        int start, middle, end,size;
        start = 0;
        end = nums.length - 1;
        
     
        //initialize of variables middle and size
        middle = (start + end) / 2;
        size=end-start+1;
        while(size>1) {
            if (size== 2) { return (nums[start] > nums[end]) ? start:end;}
            //Check if there's only one element left
            if(middle==start && middle ==end){
                return middle;
            }
            //Check if the middle index is bigger than its neighbours and if it's bigger return the index
            if (nums[middle] > nums[middle + 1]) {
                if (nums[middle] > nums[middle - 1]) return middle;
                else {
                    //middle is bigger than only the right neighbour so remove the right side of the array
                    end = middle-1;
                }
            } else {
                //the right neighbour is bigger than the middle so remove the left side of the array
                start = middle+1;
            }
            //Update of variable middle and size
            middle = (start + end) / 2;
            size =size=end-start+1;


        }
        return middle;

    }
   
}
