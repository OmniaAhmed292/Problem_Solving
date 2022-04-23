import java.util.*;
class Solution {
public List<List> subsets(int[] nums) {
    List<List> sublist = new ArrayList<>();
    int length = nums.length; //length of input array
    double n = Math.pow(2.0,length)-1;   //get num of subsets as double
    int len =(int) n;                    //num of subsets as integer
    for(int i=0;i<=len;i++){
        List list = new ArrayList<>();
        for(int j = 0 ;j<=length-1;j++){ //entering the array
            int bitshift = (1<<j);
            if((i & bitshift) !=0){      //check set bit  to add in sublist or not
                list.add(nums[j]);
                                  }
                                        }
        sublist.add(list);
                      }
    return sublist;
                                      }
                 }
                 
                
                


