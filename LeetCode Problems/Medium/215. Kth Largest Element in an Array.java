//https://leetcode.com/problems/kth-largest-element-in-an-array/
//Mergesort, Nothing Fancy

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int [] sorted=MergeSort.arrange(nums);
        return sorted[sorted.length-k];
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
