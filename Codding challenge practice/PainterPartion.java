public class PainterPartion {
    public static void main(String[] args) {
        int arr[] = {48,90};
        System.out.println(findLargest(arr, 2));
    }
    public static int timePaint(int arr[] , int mid){
        int tsum=0;
        int p =1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
             if(tsum + arr[i] <= mid){
                tsum += arr[i];
             }
             else{
                max = Math.max(max, tsum);
                tsum = arr[i];
                 p++;
             }
        }
        return p;
    }
    public static int findLargest(int arr[] , int k){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            sum += i;
        }
        if(arr.length == k){
            return max;
        }
        int low = min;
        int high = sum;
        while(low <= high){
            int mid = low +(high - low)/2;
            int p = timePaint(arr, mid);
            if(p <= k){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
}
