package Recursion.Basic;

public class GcdHcf {
    public static void main(String[] args) {
        System.out.println(get(4, 8));
    }
    public static int get(int a , int b)
    {
        if( b== 0)
        {
            return a;
        }
        return get(b, a % b);

    }
}
