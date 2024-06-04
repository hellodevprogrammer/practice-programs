import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
         int a[]={3,1,5,4,2};
        System.out.println(Arrays.toString(a));
        selection(a);
        System.out.println(Arrays.toString(a));

    }
    static void selection(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            //find the max item in the remainning array  adn swap it with correct index
            int last=arr.length-1-i;
            int maxIndex=getMaxindex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }
    private static  int getMaxindex(int[] arr,int start,int end)
    {
        int max=start;
              for(int i=start;i<=end;i++)
              {
                if(arr[max]<arr[i])
                {
                    max=i;
                }
              }
        return max;
    }
    static void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

        
    }
}
