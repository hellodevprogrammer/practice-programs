package Recursion;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        int a1[] = {4 , 6 , 8 , 5 , 9 , 12 };
        System.out.println("enter the postion of element to delete");
        int pos=sc.nextInt();
        int size = a1.length;
        for(int i = pos - 1 ; i < size - 1  ; i++)
        {
            a1[i] = a1[i+1];
        }
        --size;
        int a2[] = new int[size];
       for( int i=0 ;i < size ; i++)
       {
         a2[i] = a1[i];
       }
       System.out.println(Arrays.toString(a2));
    }
}
