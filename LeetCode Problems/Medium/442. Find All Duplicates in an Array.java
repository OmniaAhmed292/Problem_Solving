//https://leetcode.com/problems/find-all-duplicates-in-an-array/

//Hashmap solution time O(n) space O(n)
public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) > 1){
                result.add(nums[i]);
                map.put(nums[i], 0);
            }
        }
        return result;
    }
//Sorting solution time O(nlogn) space O(1)
public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                result.add(nums[i]);
            }
        }
        return result;
    }

//on-off solution time O(n) space O(1)

public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1; // as arrays are 0 based
            if(nums[index] < 0){ // if the number is already negative, then it is a duplicate
                result.add(index + 1);
            }
            nums[index] = -nums[index]; // mark the number as visited by making it negative
        }
        return result;
    }
