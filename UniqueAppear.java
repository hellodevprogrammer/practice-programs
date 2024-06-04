public class UniqueAppear {
    public static void main(String[] args) {
        int a[]={2 ,3 , 4 , 1 , 2 , 1 , 3 ,6 , 4};
        System.out.println(ans(a));
    }
    static int ans(int[] a)
    {
      int unique = 0;
    
      for(int i : a)
      {
        unique = unique ^ i;
      }
      return unique;

    }
}
