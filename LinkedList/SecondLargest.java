package LinkedList;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(secondLarge(a)));
        
    }
    static int[] secondLarge(int a[])
    {
        int smin = 0;
        int min = a[0];
        int large = 0;
         int slarge = 0;
         for(int i = 0 ; i < a.length; i++)
         {
            if(a[i] > large)
            {
                large = a[i];
                smin = large;
            }
            
         }
         for (int i = 0; i < a.length; i++) {
            
            if(large > a[i] && slarge <= a[i])
            {
                slarge = a[i];
            }
         }
         for (int i = 0; i < a.length; i++) {
            if(min > a[i])
            {
                min = a[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] > min && a[i] < smin)
            {
                smin = a[i];
            }
        }
         
         int a1[] = new int[2];
         a1[0] = slarge;
         a1[1] = smin;
         return a1;
    }

    // static int secondMin(int a[])
    // {
       
    //     int smin = a[0];

        
    //     return smin;
    // }
}
