public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if(n==0) return new ArrayList<>();
        if(n==1) return Arrays.asList(nums[0]);

        int [] dp = new int[n];
        int [] prev = new int[n];
        Arrays.sort(nums);
        int max = 0;
        int index = 0;
        
        for(int i=0;i<n;i++){
            dp[i] = 1;
            prev[i] = -1;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(dp[i]<dp[j]+1){
                        dp[i] = dp[j]+1;
                        prev[i] = j;
                    }
                }
            }
            if(dp[i]>max){
                max = dp[i];
                index = i;
            }
        }
        
        List<Integer> res = new ArrayList<>();
        while(index!=-1){
            res.add(nums[index]);
            index = prev[index];
        }
        return res;

    }
