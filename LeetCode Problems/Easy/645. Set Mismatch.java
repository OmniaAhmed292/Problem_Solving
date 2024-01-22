//https://leetcode.com/problems/set-mismatch/description/
//Frequency Array O(n)

 public int[] findErrorNums(int[] nums) {
        int [] res=new int[2];
        int []arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                res[1]=i;
            }
            if(arr[i]==2){
                res[0]=i;
            }
        }
        return res;
    }
