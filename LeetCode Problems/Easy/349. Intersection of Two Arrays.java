//https://leetcode.com/problems/intersection-of-two-arrays
//Two pointers approach
  public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //Two pointer 
        int i = 0, j = 0;
        List<Integer> res = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (res.isEmpty() || res.get(res.size() - 1) != nums1[i]) {
                    res.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] result = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            result[k] = res.get(k);
        }
        return result;

    }

//Binary search
 public int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<m;i++){
            if(i>0&&nums1[i]==nums1[i-1]){
                continue;
            }
            int left = 0;
            int right = n-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(nums2[mid]==nums1[i]){
                    res.add(nums2[mid]);
                    break;
                }else if(nums2[mid]>nums1[i]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        int[] result = new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;
    }
