class Solution {
    public boolean isPower(int x, int y) {
        // code here first method
        // if(x ==1){
        //     return y == 1;
        // }
        // long pow = 1;
        // while(pow < y){
        //     pow *= x;
        // }
        // return pow == y;
        //
        
        
        
        //Second method 
        // if(y==1){
        //     return true;
        // }
        // if(x==1){
        //     return false;
        // }
        // while(y%x==0){
        //     y/=x;
        // }
        // return y== 1;
        
        
        //third method
        if(y==1){
            return true;
        }
        if(x==1){
            return false;
        }
        //double res = Math.log(y)/Math.log(x);
        double res = Math.log(y)/Math.log(x);
        return Math.abs(res-Math.round(res))<1e-10;
    }
}