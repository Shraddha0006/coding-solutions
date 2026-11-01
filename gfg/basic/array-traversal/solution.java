class Solution {
    public void arrayTraversal(int[] arr) {
        // code here
        //1st method------------------------------
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        
        //----------------2nd method-------------
        for(int el:arr){
            System.out.print(el);
            System.out.print(" ");
        }
    }
}
