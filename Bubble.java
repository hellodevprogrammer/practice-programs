import java.util.Arrays;

/**
 * Bubble
 */
public class Bubble {

    public static void main(String[] args) {
        int a[]={3,1,5,4,2};
        System.out.println(Arrays.toString(a));
        bubble(a);
        System.out.println(Arrays.toString(a));



    }
    static void bubble(int arr[])
    {
        boolean swapped;
       //run the steps n-1 times
       for(int i=0;i<arr.length;i++)
       {
        swapped=false;
        //for each step , max item come at last respective index 
        for(int j=1;j<=arr.length-i-1;j++)
        {
            //swap if the item j is less than j-1
            if(arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swapped=true;
            }
            

        }
        //if you did not swapped for a particular  value of i , it means the arrray is sorted  hence stop the program
        
        if(swapped==false)
            {
                // !false=true and !true=false
                break;
            }
       }
    }
}