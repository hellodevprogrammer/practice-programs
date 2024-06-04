import java.util.Arrays;

public class Insertion2 {
    public static void main(String[] args) {
        int a[]={3,1,5,4,2};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<=a.length-2;i++)
        {
            int j=i+1;
              int temp=a[j];
              while(j>0 && temp<a[j-1])
              {
                a[j]=a[j-1];
                j=j-1;
              }
              a[j]=temp;
        }
        System.out.println(Arrays.toString(a));

        
    }
   
}
