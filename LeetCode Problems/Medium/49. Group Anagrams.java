//https://leetcode.com/problems/group-anagrams/
public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        if(strs.length==1){
            List<List<String>> result = new ArrayList();
            List<String> temp = new ArrayList();
            temp.add(strs[0]);
            result.add(temp);
            return result;
        }

        int[] freq = new int[26];
        List<List<String>> result = new ArrayList();
        Map<String, List<String>> map = new HashMap();
        for(String str: strs) {
            //reset the frequency array for each string
            Arrays.fill(freq, 0);
            //Fill the frequency array for each string
            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }
            //Create a key for each freqency value in the frequency array
            String sb=new String(Arrays.toString(freq));

            String key = sb;
            //If the key is not present in the map, add it to the map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            //Add the string to the list of strings for the key
            map.get(key).add(str);

        }
        //Add all the lists to the result
        result.addAll(map.values());

        return result;
    }
