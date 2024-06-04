package Recursion;

public class AllPaths {
    public static void main(String[] args) {
        boolean maze[][]={{true,true,true},
                           {true,true,true},
                           {true,true,true} }; 
                           allPaths(0, 0, maze, "");
    }

    static void allPaths(int r , int c ,boolean[][] maze, String str)
    {
        if( r== maze.length -1  && c ==  maze[0].length - 1)
        {
            System.out.println(str);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        

        // i am considering this block in my path
        maze[r][c]=false;
        if(r < maze.length - 1)
        {
           allPaths(r + 1, c, maze , str+'D');
        }
        if(c < maze[0].length - 1)
        {
            allPaths(r ,  c + 1,maze, str+'R');
        }

        if(r > 0 )
        {
            allPaths(r - 1 ,  c ,maze, str+'U');
        }
        if(c > 0)
        {
            allPaths(r , c - 1 , maze , str+'L');
        }

        // this is the line where the function will over
        // so before the function eill be ended remove the all the changes that  are made  before the function call
        maze[r][c]=true;
    }

}
