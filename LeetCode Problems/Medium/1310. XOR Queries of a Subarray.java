//https://leetcode.com/problems/xor-queries-of-a-subarray/description/
//Prefix xor
//note: xor is the inverse of xor

 public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] Xor = new int[n];
        int[] result = new int[queries.length];

        Xor[0] = arr[0];
        for (int i = 1; i < n; i++) {
            Xor[i] = Xor[i - 1] ^ arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l > 0) {
                result[i] = Xor[l - 1] ^ Xor[r];
            } else {
                result[i] = Xor[r];
            }
        }
        return result;
    }
