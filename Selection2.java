import java.util.Arrays;

public class Selection2 {
    public static void main(String[] args) {
         int a[]={3,1,5,4,2};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
