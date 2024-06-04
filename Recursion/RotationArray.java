package Recursion;

import java.util.Arrays;

public class RotationArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        // System.out.println(Arrays.toString(leftRotate(a, 3)));
        System.out.println(Arrays.toString(rightRotate(a, 3)));

    }
    static int[] leftRotate(int[] a,int n)
    {
        int j=1;
        while(j<=n)
        {
            int temp=a[0];
            for(int i=1;i<a.length;i++)
            {
                a[i-1]=a[i];
            }
            a[a.length-1]=temp;
            j++;
        }
        return a;

    }
    static int[] rightRotate(int[] a,int n)
    {
        int j=1;
        while(j<=n)
        {
            int temp=a[a.length-1];
            for(int i=a.length-2;i>=0;i--)
            {
                a[i+1]=a[i];
            }
            a[0]=temp;
            j++;
        }
        return a;
    }
}
