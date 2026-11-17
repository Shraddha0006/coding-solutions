class Solution {
    public int findMin(int[] nums) {
        //time complexity--O(nlogn) using sort function
        // Arrays.sort(nums);
        // return nums[0];

        //time complexity--O(n) using linear search
        // int mini=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<mini){
        //         mini=nums[i];
        //     }
        // }
        // return mini;

        //time complexity---o(logn) using binary search
        int l=0;
        int r=nums.length-1;
        if(nums[l]<nums[r] || nums.length==1){
            return nums[0];
        }
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=nums[0]){
                l=mid+1;
            }
            else{
                ans=nums[mid];
                r=mid-1;
            }
        }
        return ans;

    }
}