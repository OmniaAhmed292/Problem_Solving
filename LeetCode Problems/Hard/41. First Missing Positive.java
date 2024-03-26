
//Time complexity: O(nlogn) Space complexity: O(1)
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<=n;i++){
            //if the number is not found in the array, return it
            if(Arrays.binarySearch(nums,i)<0){
                return i;
            }
        }
        return n+1;
    }

//Time complexity: O(n) Space complexity: O(n)
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean[] present = new boolean[n+1];
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]<=n){
                present[nums[i]]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!present[i]){
                return i;
            }
        }
        return n+1;
    }

//Time complexity: O(n) Space complexity: O(1)
public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int ans=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]<=n){
                int correctPos=nums[i]-1;
                //if the number is not at the correct position
                if(nums[i]!=nums[correctPos]){
                    //swap
                    int temp=nums[i];
                    nums[i]=nums[correctPos];
                    nums[correctPos]=temp;
                    i--;
                }
            }
        }
        for(int i=1;i<=n;i++){
            if(nums[i-1]!=i){
                return i;
            }
        }
        return n+1;
    }



