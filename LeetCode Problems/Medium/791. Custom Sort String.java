//https://leetcode.com/problems/custom-sort-string
//Freq arr solution
public String customSortString(String order, String s) {
        int n = s.length();
        int m = order.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        String ans ="";
        for (int i = 0; i < m; i++) {
            int c = order.charAt(i) - 'a';
            while (freq[c] > 0) {
                ans+= ((char) (c + 'a'));
                freq[c]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                ans+= ((char) (i + 'a'));
                freq[i]--;
            }
        }
        
        return ans;

    }

//Hashmap solution
public String customSortString(String order, String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        String ans="";
        
        for (int i = 0; i < order.length(); i++) {
            if (map.containsKey(order.charAt(i))) {
                for (int j = 0; j < map.get(order.charAt(i)); j++) {
                    ans+=order.charAt(i);
                }
                map.remove(order.charAt(i));
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                ans+=entry.getKey();
            }
        }
        return ans;

    }
