class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        //int temp=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        int rev=0;
        int temp=sum;
        while(sum!=0){
            int rem=sum%10;
            rev=rev*10+rem;
            sum=sum/10;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
    }
}