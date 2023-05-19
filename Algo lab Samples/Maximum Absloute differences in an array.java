//Maximum Absloute differences in an array.
//Time complexity O(n^2)
//Can be done using sort and geting the difference between first and last elements.


import java.util.*;
public class Main{
public static Set<int[]> maxScore(int[] nums){
    int len=nums.length;
    int score=0;
    int max=0;
    int x=0,y=0;
    int[] arr=new int[]{x,y};
    Set<int[]> pairs=new HashSet<>();

    for(int i=0;i<len;i++){
        for(int j=i;j<len;j++){
            score=Math.abs(nums[i]-nums[j]);
            if(score==max) {
                arr[0]=x; arr[1]=y;
                if(!pairs.contains(arr))pairs.add(arr);
            }
            if(score>max){
                max=score;
            x=nums[i];
            y=nums[j];
            pairs.clear();
            arr[0]=x; arr[1]=y;
            pairs.add(arr);}

        }
    }
    System.out.println("max Score is "+max);
    return pairs;
}

    public static void main(String[] args) {
    int[] nums={1,2,3,4,5,1};
        Set<int[]> pairs=maxScore(nums);
        for(int[] pair:pairs){
            System.out.println(pair[0]+" "+pair[1]);
        }

    }

}
