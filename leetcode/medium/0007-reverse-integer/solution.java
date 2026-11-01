class Solution {
    public int reverse(int x) {
        //long y=Math.abs(x);
        long y=x;
        long rev=0;
        while(y>0){
            long rem=y%10;
            rev=rev*10+rem;
            y=y/10;
        }
        if(y<0){
            while(y<0){
                long rem=y%10;
                rev=rev*10+rem;
                y=y/10;
            }
        }
        return (int)rev;
    }
}