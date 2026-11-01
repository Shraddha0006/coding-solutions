class Solution {
    public int gcd(int n, int arr[]) {
        int gcd=arr[0];
        // code here.
        //Arrays.sort(arr);
        for(int i=1;i<n;i++){
            int a=gcd;
            int b=arr[i];
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            gcd=a;
        }
        return gcd;
    }
}