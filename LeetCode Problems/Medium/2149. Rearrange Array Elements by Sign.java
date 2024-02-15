//https://leetcode.com/problems/rearrange-array-elements-by-sign/
//Approach 1
public int[] rearrangeArray(int[] nums) {
        if(nums.length==2){
            if(nums[0]>0) return nums;
            else return new int[]{nums[1],nums[0]};
        }
        int [] res = new int[nums.length];
        int pos=0; int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[pos]=nums[i];
                pos+=2;
            }else{
                res[neg]=nums[i];
                neg+=2;
            }
        }

        return res;
    }

//Approach 2
 public int[] rearrangeArray(int[] nums) {
        if(nums.length==2){
            if(nums[0]>0) return nums;
            else return new int[]{nums[1],nums[0]};
        }
        Vector <Integer> posres=new Vector<>();
        Vector <Integer> negres=new Vector<>();
        int [] res = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                posres.add(nums[i]);
            }else{
                negres.add(nums[i]);
            }
        }
        int pos=0; int neg=0;
        for(int i=0;i< nums.length;i++){
            if(i%2==0){
                if(pos<posres.size()){
                    res[i]=posres.get(pos);
                    pos++;
                }else{
                    res[i]=negres.get(neg);
                    neg++;
                }
            }else{
                if(neg<negres.size()){
                    res[i]=negres.get(neg);
                    neg++;
                }else{
                    res[i]=posres.get(pos);
                    pos++;
                }
            }
        }

        return res;
    }
