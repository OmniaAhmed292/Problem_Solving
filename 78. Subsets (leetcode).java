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
                 
                
                
/*previous attempt without using List
import java.util.*;  
public class NewClass {
  public static void main(String[]args){
     Scanner sc= new Scanner(System.in);
    String s=sc.next();
    Vector < Integer > vec = new Vector < Integer > ();
    String numberOnly = s.replaceAll("[^0-9]", "");
    for(int i=0; i<numberOnly.length(); i++){
      vec.add(Integer. parseInt(numberOnly.substring(i, i+1)));

    }
    
  //System.out.println("[]");
  for(int i=0; i<vec.size()+1; i++){
      for(int j=i; j<vec.size()+1;j++){
          if(i== 0 && j== 0){
            System.out.print("[");
            System.out.print("[], ");//for formating
          }
          if(i!=j){
        List<Integer> subList = vec.subList(i,j);    
         
        System.out.print(subList);
         
         if(i == vec.size()-1){
            System.out.print("]");
            continue; //for formating
                     }
        System.out.print(", ");
          }
         
      }
      
  
  
    
}   
}}
*/ //It work with most cases but takes much effort in taking input and formatting output.

