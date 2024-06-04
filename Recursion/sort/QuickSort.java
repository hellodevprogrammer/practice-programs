package Recursion.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {5 , 4 , 3 , 2 , 1 };
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int nums[] ,int low, int hi )
    {
        if(low >= hi)
        {
            return;

        }
      int start = low;
      int end = hi;
     int mid = start + (end - start )/2;
     int pivot = nums[mid];

     while( start <= end)
     {
        // also reason if the array is already sorted then it will not swap
        while(nums[start] < pivot)
        {
            start++;
        }
        while(nums[end] > pivot)
        {
            end--;
        }
        if(start <= end)
        {
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp; 
          start++;
          end--;
        }
     }

     //now my pivot is at correct index ,  now please sort two halfs now
  sort(nums, low, end);
  sort(nums, start, hi);
    }
}
