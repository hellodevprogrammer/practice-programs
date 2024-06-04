package Recursion;

public class RecOcc {
    public static void main(String[] args) {
        int a[] = {3,2,4,5,6,2,7,2,2};
        recOcc(a, 0, 2);
    }
    public static void recOcc(int a[],int idx,int key)
    {
        if(idx == a.length)
        {
            return;
        }
       if(a[idx] == key )
       {
        System.out.print(idx);
       }
       recOcc(a, idx +1, key);
    }
}
