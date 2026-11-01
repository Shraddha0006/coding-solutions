class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        long total=0;
        // code here
        for(int i=0;i<car.length;i++){
            if(date%2==0){
                if(car[i]%2!=0){
                    total=total+fine[i];
                }
            }
            else{
                if(car[i]%2==0){
                    total=total+fine[i];
                }
            }
        }
        return total;
            
    }
}