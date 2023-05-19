//Given a string of digits ‘1’, ‘2’, ‘3’, and ‘4’,
// rearrange the digits using divide and conquer algorithm
// to print ‘3’ first, then ‘1’, then ‘2’, then ‘4’.

import java.util.*;


public  class ArrangeDigits3124 {
    public static int[] arrange(String nums){
        if (nums.length() <= 1) {
            return convertToIntArray(nums);
        }
        int mid = nums.length()/2;
        int[] left = arrange(nums.substring(0, mid));
        int[] right = arrange(nums.substring(mid));

        return merge(left,right);

    }
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            //3 is the only digit not in arranged place in output.
            if(left[i]==3) result[k++] = left[i++];
            else if(right[j]==3) result[k++] = right[j++];
            else if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
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

    private static int[] convertToIntArray(String nums) {
        int[] result = new int[nums.length()];
        for (int i = 0; i < nums.length(); i++) {
            result[i] = Character.getNumericValue(nums.charAt(i));
        }
        return result;
    }
    public static void main(String[] args) {
        String nums = "123";
        int[] result = ArrangeDigits3124.arrange(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

}
