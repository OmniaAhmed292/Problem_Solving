//https://leetcode.com/problems/isomorphic-strings/description/

  public boolean isIsomorphic(String s, String t) {
        Set set = new HashSet();
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(set.contains(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;

        
    }
