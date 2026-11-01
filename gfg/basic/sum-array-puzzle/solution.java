class Solution {
    public void sumArray(int[] arr) {
        // code here
        int n=arr.length;
        int[] ans=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=sum-arr[i];
        }
        //--------------------------brote force approach--------
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=0;j<n;j++){
        //         if(i==j){
        //             continue;
        //         }
        //         else{
                    
        //         }
        //     }
        // }
    }
}