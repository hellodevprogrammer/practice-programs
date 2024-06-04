public class BinaryRec {

    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        System.out.println(search(a,20,0,a.length-1));
    }
    static int search(int []a,int target,int s,int e)
    {
      if(s>e)
      {
        return -1;
      }
      int m=s+(e-s)/2;
      if(a[m]==target)
      {
        return m;
      }
       if(a[m]<target)
      {
       return search(a, target, m+1, e);

      }
      else
      {
        return  search(a, target, s, m-1);

      }
    }
}
