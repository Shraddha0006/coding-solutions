class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
        // int mini=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<mini){
        //         mini=nums[i];
        //     }
        // }
        // return mini;
    }
}