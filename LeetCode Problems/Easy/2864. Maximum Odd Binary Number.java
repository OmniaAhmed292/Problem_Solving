//https://leetcode.com/problems/maximum-odd-binary-number/description/
//Solution with no string builder
public String maximumOddBinaryNumber(String s) {
        int n= s.length();
        int zero=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
        }

        if(zero==n){
            return "0";
        }
        int ones=n-zero;
        String ans="";
        while(zero>0){
            ans+="0";
            zero--;
        }
        ans+="1";
        ones--;
        
        String res="";
        while(ones>0){
            res+="1";
            ones--;
        }
        return res+ans;

    }

//Solution with sb
public String maximumOddBinaryNumber(String s) {
        int oneCount = -1;
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < s.length(); ++i) {
        oneCount += (s.charAt(i) == '1') ? 1 : 0;
    }
    for (int i = 0; i < s.length(); i++, oneCount--) {
        ans.append(oneCount > 0 ? '1' : '0');
    }
    ans.deleteCharAt(ans.length() - 1);
    return ans.append('1').toString();
    }
