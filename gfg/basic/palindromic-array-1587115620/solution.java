class Solution {
    public static boolean isPalinArray(int[] arr) {
        
        // code here.
        for(int num:arr){
            int orignal=num;
            int reverse=0;
            while(num>0){
                int rem=num%10;
                reverse=reverse*10+rem;
                num=num/10;
            }
            if(orignal!=reverse){
                return false;
            }
        }
        return true;
    }
}