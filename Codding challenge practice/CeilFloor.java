/**
 * CeilFloor
 */
public class CeilFloor {
public static void main(String[] args) {
    int a[] = {3 ,4, 4 ,7 ,8 ,10};
    System.out.println();
//    System.out.println(floorSqrt(1));
System.out.println(Math.ceil((double)10/(double)3));
     
    // System.out.println(lowerBound(a, 8));
    // System.out.println(upperBound(a, 8));
    // System.out.println(floorSqrt(7));
}
public static long floorSqrt(long x)
	 {
        
		long low = 1;
        long high = x/2;
        while(low <= high){
            long mid = low+(high - low)/2;
            if((long)mid * (long)mid == (long)x){
                return mid;
            }else if((long)mid * (long)mid > (long) x){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return high;
		
	 }
public static int  lowerBound(int nums[] , int target){
    int low =  0;
    int ans = -1;
    int high = nums.length -1;
    while(low <= high){
        int mid = low + (high - low)/2;
        if(nums[mid] >= target){
            ans = mid;
            high = mid -1;
        }
        else{
           low = mid +1;
        }
    }
    return nums[ans];
}
public static int upperBound(int nums[],int target){
    int low=0;
   int ans = -1;
    int high = nums.length -1;
    while(low <= high){
        int mid = low + (high - low)/2;
        if(nums[mid] <= target){
        ans = mid;
            high = mid -1;
        }
        else{
             low = mid+1;
        }
    }
    return nums[ans];
}
    
}