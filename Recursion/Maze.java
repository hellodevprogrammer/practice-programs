package Recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        mazePat(3,3,"");    
        // System.out.println(patRet(3, 3, ""));
        // System.out.println(patRetDiagonal(3, 3, ""));
        // System.out.println(patRetDiagonal(3, 3, ""));
    }   
    
    static int count(int r, int c)
    {
        if(r==1 && c==1)
        {
            return 1;
        }
       int left=count(r-1, c);
       int right=count(r, c-1);
       return left+right;
    }

    static void mazePat(int r, int c,String str)
    {
       if(r==1 && c==1)
       {
        System.out.println(str);
        return;
       }
   
       if(r > 1)
       {
        mazePat(r-1, c,str+'D');
       }
       if(c > 1)
       {
        mazePat(r, c-1,str+'R');
       }
      
    
    }

    static ArrayList<String> patRet(int r, int c,String str)
    {
       if(r==1 && c==1)
       {
        ArrayList<String> list=new ArrayList<>();
        list.add(str);
        // System.out.println(str);
        return list;
       }
   
        ArrayList<String> list=new ArrayList<>();
       if(r > 1)
       {
        list.addAll(patRet(r-1, c,str+'D'));
       }
       if(c > 1)
       {
        list.addAll(patRet(r, c-1,str+'R'));
       }

       return list;
      
    
    }
    


    static ArrayList<String> patRetDiagonal(int r, int c,String str)
    {
       if(r==1 && c==1)
       {
        ArrayList<String> list=new ArrayList<>();
        list.add(str);
        // System.out.println(str);
        return list;
       }
    
        ArrayList<String> list=new ArrayList<>();
       if(r > 1 && c > 1)
       {
        list.addAll(patRetDiagonal(r-1,c-1,str+'d'));
       }
        if(r > 1)
       {
        list.addAll(patRetDiagonal(r-1, c,str+'D'));
       }
       if(c > 1)
       {
        list.addAll(patRetDiagonal(r, c-1,str+'R'));
       }

       return list;
      
    
    }
    
}
