public class KokoBanna {
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        System.out.println(minEatingSpeed(v, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        while(low <= high){
            int mid = low + (high -low)/2;
            int totalHours = totHour(piles,mid);
            if(totalHours  <= h){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
    public static int totHour(int arr[] , int ban){
        int totalHours = 0;
        
        for(int i : arr){
            totalHours+=(Math.ceil((double)i/(double)ban));
        }
        return totalHours;
    }
    public static int findMax(int[] arr){
        int max =  Integer.MIN_VALUE;
        // int max=arr[0];
        for(int i : arr){
            max = Math.max(i,max);
        }
        return max;
    }
}
