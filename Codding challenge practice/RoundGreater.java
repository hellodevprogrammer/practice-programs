public class RoundGreater {
    public static void main(String[] args) {
        
        System.out.println(nRoot(15624, 3));
    }
    public static int nRoot(int n , int m){
      int low = 1;
      int high = n;
      while(low <= high){
           int mid = low + (high - low)/2;
           if(Math.pow(mid, m) == n){
            return mid;
           }
           else if(Math.pow(mid, m) > n){
            high = mid -1;
           }
           else{
            low = mid +1;
           }
      }    
      return -1;
    }

}