import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int a[]={3,1,5,4,2};
        System.out.println(Arrays.toString(a));
        insertion(a);
        System.out.println(Arrays.toString(a));

    }
    static void insertion(int arr[])
    {
       for(int i=0;i<=arr.length-2;i++)
       {
        for(int j=i+1;j>0;j--)
        {
            if(arr[j]<arr[j-1])
            {
               swap(arr,j,j-1);
            }else{
                break;
            }
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
