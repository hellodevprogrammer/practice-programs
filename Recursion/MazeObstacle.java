package Recursion;

public class MazeObstacle {
    public static void main(String[] args) {
        // mazeObstacle(0, 0, "");
        boolean maze[][]={{true,true,true},
                           {true,false,true},
                           {true,true,true} }; 
                           mazePathObstacle(0, 0, maze, "");
    }
    static void mazeObstacle(int r , int c , String str)
    {
        if(r==2 && c==2)
        {
            System.out.println(str);
            return;
        }
        if(r==1 && c==1)
        {
            return;
        }
        if(r < 2)
        {
           mazeObstacle(r + 1, c, str+'D');
        }
        if(c < 2)
        {
            mazeObstacle(r ,  c + 1, str+'R');
        }
    }

    static void mazePathObstacle(int r , int c ,boolean[][] maze, String str)
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
        if(r < maze.length - 1)
        {
           mazePathObstacle(r + 1, c, maze , str+'D');
        }
        if(c < maze[0].length - 1)
        {
            mazePathObstacle(r ,  c + 1,maze, str+'R');
        }
    }

}
