class Solution {
    int factorial(int n) {
        int fact=1;
        // code here
        while(n!=0){
            fact=fact *n;
            n--;
        }
        return fact;
    }
}
