class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int hight=nums.length-1;
        int pos=-1;
        if(nums[0]>target){
            return 0;
        }
        while(low<=hight){
            int mid=low+(hight-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                pos=mid+1;
                low=mid+1;
            }
            else if(nums[mid]>target){
                hight=mid-1;
            }
        }
        return pos;
    }
}