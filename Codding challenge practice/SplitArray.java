public class SplitArray {
    
    public static void main(String[] args) {
        int arr[] = {2 ,3 ,2 ,8 ,2 ,7 ,6 ,6 ,10, 8 };
        System.out.println(splitArray(arr, 7));
    }
    public static int findPair(int nums[],int mid){
        int s = 0;
        int p=1;
        for(int  i =0;i< nums.length ; i++){
            if(s +nums[i] > mid){
                p++;
                s = nums[i];
            }
            else{
                s+=nums[i];
            }
        }
        return p;
    }
    public static int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums){
            max = Math.max(i,max);
            sum+=i;
        }

        int low = max;
        int high = sum;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(findPair(nums,mid) <= k){
                  high = mid-1;
            }
            else{
                low= mid +1;
            }
        } 
        return low;
    }
}
