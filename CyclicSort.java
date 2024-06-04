import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int a[]={3,5,2,1,4};
        System.out.println(Arrays.toString(a));
        cyclicSort(a);
        System.out.println(Arrays.toString(a));
        



    }
    static void cyclicSort(int[] a)
    {
        int i=0;
        while(i<a.length)
        {
            if(i!=a[i]-1)
            {
                swap(a, i, a[i]-1);
            }
            else{
                i=i+1;
            }
        }
    }
    static void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

        
    }
}
