import java.util.Arrays;

/**
 * SortSearch
 */
public class SortSearch {

    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);


    }
    public static void inZeros(int row,int col,boolean[][] ch){
          for (int i = 0; i < ch.length; i++) {
            ch[i][col] = true;
          }
          for (int i = 0; i < ch[0].length; i++) {
            ch[row][i] = true;
          }
    }
    public static void setZeroes(int[][] matrix) {
        boolean ch[][] = new boolean[matrix.length][matrix[0].length];
     for(int i = 0;i < matrix.length;i++){
        for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 0){
                inZeros(i,j,ch);
            }
        }
     } 
     for (int i = 0; i < ch.length; i++) {
        for (int j = 0; j < ch[0].length; j++) {
            if(ch[i][j] == true){
                matrix[i][j] = 0;
            }
        }
     }
     for (int [] i : matrix) {
        System.out.println(Arrays.toString(i));
     }
        
    }
    static boolean search(int [][]matrix , int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        int cmid = col/2;
        int rstart = 0;
        int rend = row -1;
        while(rstart != rend - 1)
        {
            int rmid = rstart + (rend - rend)/2;
            if(matrix[rmid][cmid] == target )
            {
                return true;
            }
            else if(matrix[rmid][cmid] > target)
            {
                rend = rmid;
            }
            else
            {
                rstart = rmid;
            }
        }
        if(matrix[rend][cmid] == target)
        {
            return true;
        }
        if(matrix[rstart][cmid] == target)
        {
            return true;
        }

        //1st part
           if(matrix[rstart][0] <= target && matrix[rstart][cmid - 1] >= target )
           {
            return binarySearch(matrix, rstart, 0, cmid - 1, target);
           }


        
        //2nd part

        if(matrix[rstart][cmid + 1] <= target && matrix[rstart][col - 1] >= target )
        {
         return binarySearch(matrix, rstart, cmid + 1, col -1, target);
        }
        //3rd part
        if(matrix[rend][0] <= target && matrix[rend][cmid - 1] >= target )
        {
         return binarySearch(matrix, rend, 0, cmid - 1, target);
        }
        //4th part
        return binarySearch(matrix, rend, cmid + 1, col -1, target);
    } 
    static boolean binarySearch(int[][] matrix ,int row, int cstart , int cend, int target)
    {
        int colmid = cstart + (cend - cstart)/2;
        while(cstart <= cend)
        {
            if(matrix[row][colmid] == target)
            {
                return true;
            }
            else if(matrix[row][colmid] > target)
            {
                cend = colmid -1;
            }
            else
            {
                cstart = colmid + 1;
            }
        }
        return false;
    }
}