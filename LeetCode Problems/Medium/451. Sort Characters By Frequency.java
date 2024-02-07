//https://leetcode.com/problems/sort-characters-by-frequency/
//Bucket list 

public String frequencySort(String s) {
        Map <Character, Integer> map = new HashMap();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        Vector <Character> [] bucket = new Vector[s.length()+1];
        for(char c: map.keySet()){
            int freq = map.get(c);
            if(bucket[freq]==null){
                bucket[freq] = new Vector();
            }
            bucket[freq].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i]!=null){
                for(char c: bucket[i]){
                    for(int j=0; j<i; j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
