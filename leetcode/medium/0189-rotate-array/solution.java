class Solution {
    public void rotate(int[] nums, int k) {
        // int n=nums.length;
        // for(int i=n-k ;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        //     //return nums[i]+" ";
        // }
        // for(int j=0;j<n-k;j++){
        //     System.out.print(nums[j]+" ");
        //     //return nums[j]+" ";
        // }

        //-------------------------1st method--------------
        int n= nums.length;
        k=k%n;
        int [] arr=new int[n];
        int index=0;
        for(int i= n-k; i<n;i++){
            arr[index++]=nums[i];
        }
        for(int i=0; i<n-k;i++){
            arr[index++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        //-------------------------2nd method------------
        // void reverse(int arr[],int st,int end){
        //      while(st<end){
        //     int temp=nums[st];
        //     nums[st]=nums[end];
        //     nums[end]=temp;

        //     st++;
        //     end++;
        // }

    }
}