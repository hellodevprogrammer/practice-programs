package Recursion.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int a[] = {3,2,5,1,6,9,8};
        System.out.println(Arrays.toString(mergeSort(a)));        
    }
    static int[] mergeSort(int a[])
    {
        if(a.length == 1)
        {
          return a;
        }
         int mid = a.length/2;
         
         int left[] = mergeSort(Arrays.copyOfRange(a, 0, mid)); 
         int right[] = mergeSort(Arrays.copyOfRange(a, mid, a.length));

         return merge(left,right);
          
    }
    static int[] merge(int first[] ,int second[])
    {
       int[]  mix = new int[first.length + second.length];

       int i=0;
       int j=0;
       int k=0;
     
       while (i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mix[k++] = first[i++];
            } 
            else
            {
                mix[k++] = second[j++];
            }
           
       }
      while(i < first.length)
       {
        mix[k++] = first[i++];
       }
       while(j < second.length){
        mix[k++]= second[j++];
       }


       return mix;


    }
}
