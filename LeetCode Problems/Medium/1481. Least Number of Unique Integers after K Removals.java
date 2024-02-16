import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
class Solution {
     public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Vector<Integer> vec = new Vector<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            vec.add(entry.getValue());
        }
        int[] arr2 = new int[vec.size()];
        for (int i = 0; i < vec.size(); i++) {
            arr2[i] = vec.get(i);
        }
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if (k >= arr2[i]) {
                k -= arr2[i];
                arr2[i] = 0;
            } else {
                arr2[i] -= k;
                k = 0;
                break;
            }
        }

        return (int) Arrays.stream(arr2).filter(x -> x != 0).count();
    }
}
