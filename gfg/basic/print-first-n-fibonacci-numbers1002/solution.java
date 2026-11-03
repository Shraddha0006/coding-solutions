class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(fibonacci(i));
        }
        return ans;
    }
    int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}