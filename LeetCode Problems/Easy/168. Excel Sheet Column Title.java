//https://leetcode.com/problems/excel-sheet-column-title

public String convertToTitle(int columnNumber) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder prefix = new StringBuilder();
        int q = columnNumber;
        while(q>0){
            int r = q%26;
            q--; //adjst for the system being 1-based
            q = q/26;
            if(r>0){
                prefix.append(alphabet[r - 1]);
            }
            else{
                prefix.append(alphabet[alphabet.length-1]);
                
            }

        }

        return prefix.reverse().toString();
    }
