class Solution {
    public boolean checkIfPangram(String sentence) {
        // if(sentence.length()<26)return false;
        // for(char ch='a';ch<='z';ch++){
        //     if(sentence.indexOf(ch)<0){
        //         return false;
        //     }
        // }
        // return true;

        boolean[] arr=new boolean[26];
        int count=0;
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(arr[ch-'a']==false)
            count++;
            arr[ch-'a']=true;
        }
        return count==26;
    }
}