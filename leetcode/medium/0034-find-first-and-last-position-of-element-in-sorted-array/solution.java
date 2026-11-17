class Solution{
    int binarySearch(int[] nums,int target,boolean flag){
        int l=0;
        int r=nums.length-1;
        int pos=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target<nums[mid]){
                r=mid-1;
            }   
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                pos=mid;
                if(flag==true){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return pos;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int left=binarySearch(nums,target,true);
        int right=binarySearch(nums,target,false);

        ans[0]=left;
        ans[1]=right;
        return ans;
    }
}