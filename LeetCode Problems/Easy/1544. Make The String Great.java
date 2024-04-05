//https://leetcode.com/problems/make-the-string-great/
public String makeGood(String S) {
        Stack<Character> stack = new Stack<>();
        //Difference between the ASCII values of the upper case and lower case letters is 32
        
        for(char c : S.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek() - c) == 32){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        String sb = "";
        while(!stack.isEmpty()){
            sb=sb+stack.pop();
        }
        return sb.transform(s -> new StringBuilder(s).reverse().toString());
    }
