class Solution {
    public void sortColors(int[] nums) {
        /*
        approach 1st ----------------------sort;
        Arrays.sort(nums);
        */
        /*
        approach 2nd------------------------count0.count 1.count2----
        */
        // int count_0=0;
        // int count_1=0;
        // int count_2=0;
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count_0++;
        //     }
        //     else if(nums[i]==1){
        //         count_1++;
        //     }
        //     else{
        //         count_2++;
        //     }
        // }
        // int index=0;
        // while(count_0>0){
        //     nums[index]=0;
        //     index++;
        //     count_0--;
        // }
        // while(count_1>0){
        //     nums[index]=1;
        //     index++;
        //     count_1--;
        // }
        // while(count_2>0){
        //     nums[index]=2;
        //     index++;
        //     count_2--;
        // }
        

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}