import java.util.Arrays;

public class AggCow {
public static void main(String[] args) {
    int a[] = {4,2,1,3,6};
    System.out.println(aggressiveCows(a, 2));
    
}
public static boolean isPossible(int[] stalls , int k , int mid){
    int countCows = 1;
    int lastCow = stalls[0];
    for (int i = 1; i < stalls.length; i++) {
          if( stalls[i] -  lastCow >= mid ){
            countCows++;
            lastCow = stalls[i];
          }
          if(countCows >= k){
            return true;
          }
    }
    return false;
}
public static int aggressiveCows(int []stalls, int k) {
      Arrays.sort(stalls);
     int low = 1;
     int high  = stalls[stalls.length -1] - stalls[0];
     while(low <= high){
        int mid = low + (high -low)/2;
        if(isPossible(stalls,k,mid)){
            low = mid +1;
        }
        else{
            high = mid -1;
        }
     }

    return high;
}
    
}