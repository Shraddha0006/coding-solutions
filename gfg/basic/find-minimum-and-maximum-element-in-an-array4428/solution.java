class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        //int min=arr[0];
        // code Here
        int min=arr[0];
        int max=arr[0];
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
            if(arr[j]>max){
                max=arr[j];
            }
        }
        ArrayList<Integer>ans= new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
