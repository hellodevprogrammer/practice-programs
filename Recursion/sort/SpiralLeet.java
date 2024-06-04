package Recursion.sort;

import java.util.ArrayList;

public class SpiralLeet {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12,}};
      
            ArrayList<Integer> list = new ArrayList<>();
     ArrayList<Integer> list1 = spiralMatrix(a, 0, 0, 1, 0, list);  
     System.out.println(list1);       
    }
    

    static ArrayList<Integer> spiralMatrix(int a[][] ,int row,int col, int counter  , int ch , ArrayList<Integer> list )
    {
        int temp = a[0].length * a.length;
  
       

        for (int i = col; i <= a[0].length - 1 - ch; i++) {
            
            list.add(a[row][col++]);
             counter++;
            if(counter > temp )
            {
                return list;
            }
        
        }
        col--;
        for (int j = ++row; j <= a.length - 1 - ch; j++) {
            
            list.add(a[row++][col]); 
             counter++;
            if(counter > temp )
            {
                return list;
            }
        }
        row--;
        for( int  k = --col ; k >= ch ; k--)
        {
             list.add(a[row][col--]); 
              counter++;
            if(counter > temp )
            {
                return list;
            }

        } 
        col++;
        ch++;

        for(int l = --row ; l>= ch; l--)
        {
            list.add(a[row--][col]); 
             counter++;
            if(counter > temp )
            {
                return list;
            }
        }
        row++;
        col++;
        return spiralMatrix(a, row, col, counter, ch ,list);
   

    }
}
