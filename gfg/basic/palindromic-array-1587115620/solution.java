class Solution {
    public static boolean isPalinArray(int[] arr) {
        
        // code here.
        // for(int num:arr){
        //     int orignal=num;
        //     int reverse=0;
        //     while(num>0){
        //         int rem=num%10;
        //         reverse=reverse*10+rem;
        //         num=num/10;
        //     }
        //     if(orignal!=reverse){
        //         return false;
        //     }
        // }
        // return true;
        
        for(int i=0;i<arr.length;i++){
            int orignal=arr[i];
            int reverse=0;
            while(arr[i]>0){
                int rem=arr[i]%10;
                reverse=reverse*10+rem;
                arr[i]=arr[i]/10;
            }
            if(orignal!=reverse){
                return false;
            }
        }
        return true;
    }
}