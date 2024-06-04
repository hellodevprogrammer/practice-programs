import java.util.Arrays;

public class BubbleRec {
    public static void main(String[] args) {
           int a[]={4,3,2,1};
        //    System.out.println(Arrays.toString(a));
           bubble(a, a.length-1, 0);
           System.out.println(Arrays.toString(a));        

    }
    static void bubble(int arr[],int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c < r)
        {
            if(arr[c]>arr[c+1])
            {
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr, r, ++c);
        }
        else{
            bubble(arr, r-1, 0);
        }
    }
}
