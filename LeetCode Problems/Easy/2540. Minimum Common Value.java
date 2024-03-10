//https://leetcode.com/problems/minimum-common-value
//Two pointers solution
public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int res = -1;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res = nums1[i];
                break;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }
//Binary search solution 
public int getCommon(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        for(int i=0;i<m;i++){
            int left = 0;
            int right = n-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(nums2[mid]==nums1[i]){
                    return nums2[mid];
                }else if(nums2[mid]>nums1[i]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }
