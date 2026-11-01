class Solution {
    public int findGCD(int[] nums) {
        int mini=nums[0];
        int maxi=nums[0];
        for(int e1 : nums){
            if(e1<mini)
                mini=e1;
            else if(e1>maxi)
                maxi=e1;
        }

            int a=maxi,b=mini;

            
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;
    }
}