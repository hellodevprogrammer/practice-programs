
package Recursion.sort;
import java.util.Arrays;
import java.math.*;
public class TrappingWater {
    public static void main(String[] args) {
        int arr[] = {3, 0, 2, 0, 4};
        // System.out.println(Arrays.toString(leftHigh(arr)));
        System.out.println(trappingWater(arr));
    }
    static long trappingWater(int a[]) { 
        long count = 0;
        for(int i=0; i < a.length ; i++)
        {
          
          int l[]= leftHigh(a);
          int r[] = rightHigh(a);
          count = count + (Math.min(l[i] , r[i]) - a[i]);


        }
        return count;
        // Your code here

    }
    static int[] leftHigh(int a[])
    {
    int l[] =new int[a.length];
       int large = a[0];
       l[0] = large; 
       for(int i=1 ; i< a.length ; i++)
       {
        if(large < a[i])
        {
            large = a[i];
            l[i] = large;
        }
        l[i] = large;
       }
       return l;
       }
    static int[] rightHigh(int a[])
    {
    int r[] =new int[a.length];
       int large = a[0];
       r[a.length -1] = large; 
       for(int i=a.length -1 ; i>= 0 ; i--)
       {
        if(large < a[i])
        {
            large = a[i];
            r[i] = large;
        }
        r[i] = large;
       }
       return r;
       }

    }

