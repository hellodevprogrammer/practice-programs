
public class AllocateBook {
public static void main(String[] args) {
    int a[] = {25 ,46 ,28 ,49 ,24};
    System.out.println(findPages(a, a.length, 4));
}
public static int countStudent(int arr[],int pages ){
    int stud = 1;
    int pageStudent = 0;
    for (int i = 0; i < arr.length; i++) {
            if(pageStudent + arr[i] <= pages){
                pageStudent+=arr[i];
            }else{
                stud++;
                pageStudent = arr[i];
            }
    }
    return stud;
}
    public static int  findPages(int[] arr , int n , int m){
             int max = Integer.MIN_VALUE;
             int sum = 0;
             for (int i : arr) {
                  sum+=i;
                  max = Math.max(max, i);
             }
             int low = max;
             int high = sum;
             while(low <= high){
                int mid = low + (high -low)/2;
                if(countStudent(arr, mid) <= m){
                    high = mid -1;
                }else{
                    low = mid +1;
                }
             }
             return low;
    }
}