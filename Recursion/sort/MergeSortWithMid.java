package Recursion.sort;

import java.util.Arrays;

public class MergeSortWithMid {
    public static void main(String[] args) {
        int a[] = {3,2,5,1,6,9,8};
        mergeSortInPlace(a , 0 , a.length - 1);
        System.out.println(Arrays.toString(a));       
    }

     static void mergeSortInPlace(int a[] , int s , int e)
    {
        if(e - s == 1)
        {
            return;
         
        }
         int mid = s + (e - s)/2;
         
         mergeSortInPlace(a, 0, mid); 
          mergeSortInPlace(a, mid, a.length);

         mergeInPlace(a , s , e, mid);
          
    }
    static void mergeInPlace(int a[] , int s ,int m , int e)
    {
       int[]  mix = new int[e];

       int i=s;
       int j=m;
       int k=0;
     
       while (i < m && j < e)
        {
            if(a[i] < a[j])
            {
                mix[k++] = a[i++];
            } 
            else
            {
                mix[k++] = a[j++];
            }
           
       }
      while(i < m)
       {
        mix[k++] = a[i++];
       }
       while(j < e){
        mix[k++]= a[j++];
       }


       for(int l = 0 ; l < mix.length; l++)
       {
        a[s+l] = mix[l];
       }


    }
}
