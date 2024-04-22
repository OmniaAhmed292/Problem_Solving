//https://leetcode.com/problems/open-the-lock
public int openLock(String[] deadends, String target) {
        if(target.equals("0000")){
            return 0;
        }
        if(Arrays.asList(deadends).contains("0000")){
            return -1;
        }
        Set<String> deadEnds = new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String current = queue.poll();
                if(current.equals(target)){
                    return level;
                }
                if(deadEnds.contains(current)){
                    continue;
                }
                deadEnds.add(current);
                for(int j = 0; j < 4; j++){
                    String up = plusOne(current, j);
                    if(!deadEnds.contains(up)){
                        queue.add(up);
                    }
                    String down = minusOne(current, j);
                    if(!deadEnds.contains(down)){
                        queue.add(down);
                    }
                }
            }
            level++;
        }
        return -1;
    }
    public String plusOne(String s, int j){
        char [] ch = s.toCharArray();
        if(ch[j] == '9'){
            ch[j] = '0';
        }else{
            ch[j] += 1;
        }
        return new String(ch);
    }
    public String minusOne(String s, int j){
        char [] ch = s.toCharArray();
        if(ch[j] == '0'){
            ch[j] = '9';
        }else{
            ch[j] -= 1;
        }
        return new String(ch);
    }
