class Solution {
    public boolean isPalindrome(String s) {
        // s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        // return new StringBuilder(s).reverse().toString().equals(s);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
                if(ch>='A' && ch<='Z'){
                    ch=(char)('a'+ch-'A');
                }
                sb.append(ch);
            }
        }
        int start=0;
        int last=sb.length()-1;
        while(start<last){
            if(sb.charAt(start)!=sb.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}