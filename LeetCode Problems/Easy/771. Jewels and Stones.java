//https://leetcode.com/problems/jewels-and-stones/

 public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;

    }
