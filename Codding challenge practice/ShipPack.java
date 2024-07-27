public class ShipPack {
    public static void main(String[] args) {
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights, 5));
    }
   public static int reqDays(int[] weights,int mid ){
    int days  = 1 ;
    int load = 0;
    for (int i = 0; i < weights.length; i++) {
        if(load + weights[i] > mid){
            days++;
            load = weights[i];
        }
        else{
            load += weights[i];
        }
    }
    return days;
   }
    public static int shipWithinDays(int[] weights ,int days){
        int sum= 0;
        int max = Integer.MIN_VALUE;
        for (int i : weights) {
            sum+=i;
            max = Math.max(i, max);
        }
        int low =max;
        int high = sum;
        
        while(low <= high){
            int mid = low + (high - low)/2;
           int noDays = reqDays(weights,mid);
           if(noDays <= days){
            high = mid -1;
           }
           else{
             low = mid +1;
           }
        }
         return low;

    }
}
