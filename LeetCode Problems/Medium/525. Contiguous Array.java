//https://leetcode.com/problems/contiguous-array/
public static int findMaxLength(int[] nums){
     int n=nums.length;
        int [] prefix=new int[n];
        HashMap <Integer, Integer> map=new HashMap<>();
        if(n==1) return 0;
        if (nums[0] == 1) prefix[0] = 1;
        else prefix[0] = -1;
        map.put(prefix[0],0);
        int max=0;

        for(int i=1;i<n;i++){
            if(nums[i]==1) prefix[i]=prefix[i-1]+1;
            else prefix[i]=prefix[i-1]-1;
            if(!map.containsKey(prefix[i])){
                map.put(prefix[i],i);
            }
            else{
                int res=i- map.get(prefix[i]);
                if(max<res) max=res;
            }
            if(prefix[i]==0 && (i+1)>max) max=i+1;
        }

        return max;
    }
