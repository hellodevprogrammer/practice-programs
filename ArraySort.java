public class ArraySort {
    public static void main(String[] args) {
       int a[]={10,20,30,40,50};

        System.out.println(sortArr(a, 0));
    }
    static boolean sortArr(int[] a,int index)
    {
          if(index==a.length-1)
          {
            return true;
          }
          return a[index]<a[index+1] && sortArr(a, index+1);
    } 
}
