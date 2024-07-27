import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        // int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int mat[][] = {{1},{3}};
        int arr[][] = { {0,0},{1,1}};

        System.out.println(rowWithMax1s(arr));
        // System.out.println(Arrays.toString(searchMatrix(mat, 0)));
    }


    public static  int rowWithMax1s(int arr[][]) {
         int count = 0;
         int ans = -1;
         int idx = -1;
         for(int[] i : arr){
            ++idx;
            if(count < countOne(i)){
                count = countOne(i);
               ans = idx;
            }
         }
         return ans;
    }
    public static int countOne(int []nums){
        int low = 0;
        int count = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == 1){
                high = mid -1;
                count = Math.max(count , (nums.length - mid));
            }
            else{
                low = mid +1;
            }
        }
        return count;
    }

    public static int[] searchMatrix(int matrix[][] , int target){
        int rows = matrix.length - 1;
        int cols = matrix[0].length -1;
        int rstart = 0;
        int rend = rows;
        int cmid = cols/2;
        if(rows == 0){
            return search(matrix,0,0,cols,target);
        }  
        while(rstart != rend-1){
            int rmid = rstart + (rend - rstart)/2;
            if(matrix[rmid][cmid] == target){
                return new int[]{rmid,cmid};
            } 
            else if(matrix[rmid][cmid] > target){
                rend = rmid;
            }else{
                rstart = rmid;
            }
        }
        if(matrix[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rend][cmid] == target){
            return new int[]{rend,cmid};
        }

        //1part
        if(matrix[rstart][cmid -1] >= target){
            return search(matrix, rstart,0, cmid -1, target);
        }
        //2part
        if(matrix[rstart][cmid +1]  <= target && matrix[rstart][cols] >= target){
            return search(matrix, rstart,cmid + 1, cols , target);
        }
        //3part
        if( matrix[rstart + 1][cmid -1] >=  target){
            return search(matrix, rstart + 1,0, cmid -1, target);
        }
        else{
            return search(matrix, rstart +1,cmid +1 , cols, target);
        }
        
    }
    public static int[] search(int [][]matrix , int row , int cstart , int cend , int target)
    {
              while(cstart <= cend){
                int cmid = cstart + (cend - cstart)/2;
               
                if(matrix[row][cmid] == target){
                    return new int[] {row ,cmid};
                } 
                else if(matrix[row][cmid] > target){
                    cend = cmid -1;
                }else{
                    cstart = cmid +1;
                }
                
              }
              return new int[]{1,-1};
    }
    

}

