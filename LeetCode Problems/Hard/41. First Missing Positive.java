
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

