public class BloomFlowers {
    public static void main(String[] args) {
        int flower[] ={7,7,7,7,12,7,7};
        System.out.println(minDays(flower, 2, 3));
    }
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(i, min);
        }
        return min;
    }
    public static int max(int []arr){
        int max = Integer.MAX_VALUE;
        for (int i : arr) {
            max =Math.max(max, i);
        }
        return max;
    }
    public static boolean isPossible(int arr[] , int day , int m , int k){
        int count = 0;
        int nb = 0;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] <= day){
                    count++;
                }
                else{
                    nb += count/k;
                    count = 0;
                }
        }
        nb += count/k;
        if(nb >= m){
            return true;
        }
        return false;
    }
    public static int minDays(int[] bloomDay , int m , int k){
       int low = min(bloomDay);
       long val = (long) m * k;
       int high = max(bloomDay);
       int ans = high;
       if(val > bloomDay.length){
        return -1;
       }
       while (low <= high) {
        int mid = (low + high)/2;
        if (isPossible(bloomDay, mid, m, k)) {
            //   ans = mid;
            
              high = mid -1;
            }
            else{
                low = mid +1;
            }
       }
       return low;
    }
}
