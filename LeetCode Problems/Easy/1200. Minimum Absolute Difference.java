//https://leetcode.com/problems/minimum-absolute-difference
//The code require sort, so it contains Merge sort implementation
public static List<List<Integer>> minimumAbsDifference(int[] numsArr) {
        int [] nums=MergeSort.arrange(numsArr);
        int len=nums.length;
        int score=0;
        int min=Integer.MAX_VALUE;
        List<List<Integer>> pairs=new ArrayList<>();
        for(int i=0;i<len-1;i++) {
            score = Math.abs(nums[i] - nums[i + 1]);
            if(score==min) {
                List<Integer>arr=new ArrayList<>();
                arr.add(nums[i]); arr.add(nums[i+1]);
                if(!pairs.contains(arr)) pairs.add(arr);
            }
            if(score<min){
                min=score;
                pairs.clear();
                List<Integer>arr=new ArrayList<>();
                arr.add(nums[i]); arr.add(nums[i+1]);
                pairs.add(arr);}
        }
        pairs.sort((p1, p2) -> p1.get(0) - p2.get(0));
        return pairs;
        }
        

public static void main(String[]args){
    int []numsArr=new int[]{2,1,3,4};
    List<List<Integer>> pairs=minimumAbsDifference(numsArr);
    int [] nums=MergeSort.arrange(numsArr);
    System.out.println("Pairs with max score: ");
    for (List<Integer> pair : pairs) {
        System.out.println("(" + pair.get(0)+ ", " + pair.get(1) + ")");
    }
    for (int num : nums) {
        System.out.println(num);
    }
}

}

class MergeSort {
    public static int[] arrange(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = arrange(Arrays.copyOfRange(nums, 0, mid));
        int[] right = arrange(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {
                result[k++] = left[i++];
            }
            else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
    private static int[] convertToIntArray(int nums) {
        int[] result = new int[]{nums};
        return result;
    }

}
