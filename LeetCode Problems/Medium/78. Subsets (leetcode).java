//Problem: https://leetcode.com/problems/subsets/
import java.util.*;
class Solution {
public List<List> subsets(int[] nums) {
    List<List> sublist = new ArrayList<>();
    //length of input array
    int length = nums.length;
    //get num of subsets as double
    double n = Math.pow(2.0,length)-1;  
    //num of subsets as integer
    int len =(int) n;                    
    for(int i=0;i<=len;i++){
        List list = new ArrayList<>();
        for(int j = 0 ;j<=length-1;j++){ //entering the array
            int bitshift = (1<<j);
            //check set bit  to add in sublist or not
            if((i & bitshift) !=0){      
                list.add(nums[j]);
             }
        }
        sublist.add(list);
    }
    return sublist;
}
                 
}
                 
                
                


