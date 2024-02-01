//https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/
public int[][] divideArray(int[] nums, int k) {
        int [][] result = new int[nums.length/3][3];
        if(nums.length%3!=0) {
            return new int[][]{};
        }
        Arrays.sort(nums);
        int i=0;
        int it=0;
        while(i<nums.length-2){
            int here=nums[i];
            int next=nums[i+1];
            int nnext=nums[i+2];
            int [] arr=new int[3];
            arr[0]=here;
            if(next-here<=k) arr[1]=next; else return new int[][]{};
            if(nnext-here<=k) arr[2]=nnext;else return new int[][]{};
            result[it]=arr;
            i=i+3;
            it++;
        }
    return result;
    }
