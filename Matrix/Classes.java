class Solution {
    static int findFloor(long arr[], int n, long x)
    {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                end = mid -1;
            }else{
                start = mid -1;
            }
        }
        return end;
    }
    
public static void main(String[] args) {
    
}
}