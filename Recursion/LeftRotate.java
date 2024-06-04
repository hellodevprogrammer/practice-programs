package Recursion;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotate(a , 2)));
    }
    static int[] leftRotate(int a[] , int k )
    {
        for(int j = 1 ; j <= k; j++)
        {
            int temp = a[0];
         for(int i = 1; i < a.length; i++)
         {
            a[i - 1] = a[i];
         }
         a[a.length - 1] = temp;
        }

         return a;
         
    }
}
