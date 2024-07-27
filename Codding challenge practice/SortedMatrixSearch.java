/**
 * SortedMatrixSearch
 */
public class SortedMatrixSearch {

    public static void main(String[] args) {
        int a[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(isPresent(a, 13));
    }
    public static boolean isPresent(int [][]matrix,int target){
        int low = 0;
        int high = matrix.length * matrix[0].length;
        while(low <= high){
            int mid = low + (high - low)/2;
            int row = mid /matrix[0].length;
            int col = mid %matrix[0].length;
            if(matrix[row][col] == target){
                  return true;
            }
            else if(matrix[row][col] > target){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}