package Recursion;

import java.util.Arrays;

public class PrintMatrixPaths {
    public static void main(String[] args) {
    
        boolean maze[][]={{true,true,true},
                           {true,true,true},
                           {true,true,true} }; 

                           int a[][]=new int[maze.length][maze[0].length];
        allPaths(0, 0,a , 1,maze , "");
    }
    static void allPaths(int r , int c ,int a[][],int count,boolean[][] maze, String str)
    {
        if( r== maze.length -1  && c ==  maze[0].length - 1)
        {
            a[r][c]=count;
            for(int i[] : a)
            {
              System.out.println(Arrays.toString(i));
            }
            System.out.println(str);
            System.out.println();
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
       

        // i am considering this block in my path
        maze[r][c]=false;
        a[r][c]=count;
        if(r < maze.length - 1)
        {
           
           allPaths(r + 1, c,a,count+1, maze , str+'D');
        }
        if(c < maze[0].length - 1)
        {
           

            allPaths(r ,  c + 1,a,count+1,maze, str+'R');
        }

        if(r > 0 )
        {
         
             
            allPaths(r - 1 ,  c ,a,count+1,maze, str+'U');
        }
        if(c > 0)
        {

            allPaths(r , c - 1 ,a,count+1 ,  maze , str+'L');
        }

        // this is the line where the function will over
        // so before the function eill be ended remove the all the changes that  are made  before the function call
        maze[r][c]=true;
        a[r][c]=0;
    }

}
