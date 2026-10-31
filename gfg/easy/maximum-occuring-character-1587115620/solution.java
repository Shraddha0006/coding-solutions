class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        // int [] arr=new int[26];
        // for(int i=0;i<s.length();i++){
        //     arr[s.charAt(i)- 'a']++;
        // }
        // int maxfreq=0;
        // char result='a';
        // for(int i=0;i<26;i++){
        //     if(arr[i]>maxfreq){
        //         maxfreq=arr[i];
        //         result=(char) ('a'+i);
        //     }
        // }
        // return result;
        
        int [] freq=new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int maxi=freq[0];
        char ch='a';
        
        for(int i=1;i<26;i++){
            if(freq[i]>maxi){
                maxi=freq[i];
                ch=(char)('a'+i);
            }
        }
        return ch;
        
    }
}