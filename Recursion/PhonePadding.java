package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhonePadding {
    public static void main(String[] args) {
    //    System.out.println(arrPad("", "12"));
    System.out.println(upPad("", "23"));
    }
    static void pad(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int n1=up.charAt(0)-'0';//this will convert '2' to 2
        for(int i=(n1-1)*3;i<n1*3;i++)
        {
            char ch=(char)('a'+i);
            pad(p+ch, up.substring(1));
        }

    }

    static ArrayList<String> arrPad(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int n1=up.charAt(0)-'0';//this will convert '2' to 2
        ArrayList<String> list=new ArrayList<>();
        for(int i=(n1-1)*3;i<n1*3;i++)
        {
            char ch=(char)('a'+i);
            list.addAll(arrPad(p+ch, up.substring(1)));
        }
        return list;

    }
    

    static ArrayList<String> upPad(String p,String up)
    {
        
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int n1=up.charAt(0)-'0';//this will convert '2' to 2
        int start;
        if (n1<8)
         {
         start=(n1 - 2)*3;
            
        }
        else{
             start = (n1 -2) * 3 + 1;
        }
        int end;
        if(n1 == 7 || n1==9)
        {
            end=start+3;
        }
        else{
            end=start+2;
        }    

      
      ArrayList<String> list=new ArrayList<>();
 
        for(int i=start;i<=end;i++)
        {
            char ch=(char)('a'+i);
            list.addAll(upPad(p+ch, up.substring(1)));
        }

          return list;
    }
}
