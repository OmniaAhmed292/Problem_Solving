//https://leetcode.com/problems/occurrences-after-bigram

   public String[] findOcurrences(String text, String first, String second) {
        String [] textArray = text.split(" ");
        List<String> answer= new ArrayList<String>();
        for(int i=0;i<textArray.length-2;i++){
            if(Objects.equals(textArray[i], first) && Objects.equals(textArray[i + 1], second)){
                answer.add(textArray[i + 2]);
            }
        }

        return answer.toArray(new String[0]);

    }
