//Given an array, print all possible sums of pairs.
//Complexity: O(n2)
import java.util.*;

public class PossibleSums {
    public static List<List> subsets(int[] nums) {
        List<List> sublist = new ArrayList<>();
        int length = nums.length;
        //get num of subsets as double
        double n = Math.pow(2.0,length)-1;
        //num of subsets as integer
        int len =(int) n;
        for(int i=0;i<=len;i++){
            List list = new ArrayList<>();
            for(int j = 0 ;j<=length-1;j++){
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

    public static Set<Integer> sumofsubsets(List<List> nums) {

        Set<Integer> sublist = new HashSet<Integer> ();
        int length = nums.size();
        for(int i=0;i<length;i++){
            if(nums.get(i).size()==0) continue;
            if(nums.get(i).size()==1){
                sublist.add((int)nums.get(i).get(0));
            }
            else {
                int sum=0;
                for(int j=0;j<nums.get(i).size();j++){
                    sum=sum+(int)nums.get(i).get(j);

                }
                sublist.add(sum);

            }
        }
        return sublist;
    }
    public static void main(String[] args) {
        //All possible pairs
        System.out.println(Solution.subsets(new int[]{2,3,4,4}));
        //All possible sums of pairs
        System.out.println(Solution.sumofsubsets(Solution.subsets(new int[]{2,3,4,4})));
    }
}