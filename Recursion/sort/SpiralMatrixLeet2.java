package Recursion.sort;

import java.util.Arrays;

public class SpiralMatrixLeet2 {
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int x[][] = spiralMatrix(a, 0, 0, 1, 0);
        for (int[] i : x) {
            System.out.println(Arrays.toString(i));
        }
        
    }

    static int[][] spiralMatrix(int a[][] ,int row,int col, int counter  , int ch )
    {
        int temp = a[0].length * a.length;
        for (int i = col; i <= a[0].length - 1 - ch; i++) {
            
            a[row][col++] = counter++;
            if(counter > temp )
            {
                return a;
            }
        
        }
        col--;
        for (int j = ++row; j <= a.length - 1 - ch; j++) {
            
            a[row++][col] = counter++;
            if(counter > temp )
            {
                return a;
            }
        }
        row--;
        for( int  k = --col ; k >= ch ; k--)
        {
            a[row][col--] = counter++;
            if(counter > temp )
            {
                return a;
            }

        } 
        col++;
        ch++;

        for(int l = --row ; l>= ch; l--)
        {
            a[row--][col] = counter++;
            if(counter > temp )
            {
                return a;
            }
        }
        row++;
        col++;
        return spiralMatrix(a, row, col, counter, ch);
   

    }
}
