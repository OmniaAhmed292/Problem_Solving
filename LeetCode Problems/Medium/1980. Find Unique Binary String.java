// https://leetcode.com/problems/find-unique-binary-string/

// First intution convert then sort (gives FIRST missing number)
  public String findDifferentBinaryString(String[] nums) {
       ArrayList <Integer> tenBasedNums = new ArrayList<Integer>();
       String ans = "";
       for(String num : nums){
           int tenBased = Integer.parseInt(num,2);
           tenBasedNums.add(tenBased);
       }
       tenBasedNums.sort(Integer::compareTo);
       int i=0;
       while(i<Math.pow(2,nums.length)){
           if(i != tenBasedNums.get(i)){
               return decToBin(nums.length,i);
           }
           else{
               i++;
               if(i==tenBasedNums.size()) return decToBin(nums.length,i);
           }

       }
    return ans;
    }

    public String decToBin(int base, int n)
    {
        String ans = "";
        for (int i = base-1; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                ans += "1";
            else
                ans += "0";
        }
        return ans;
    }

// Cantor's diagonal argument similar solution (gives any missing number)
 public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<nums.length;i++){
            ans.append(nums[i].charAt(i) == '0' ? '1' :'0');
        }
        return ans.toString();
    }
