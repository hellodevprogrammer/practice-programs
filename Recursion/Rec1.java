package Recursion;

public class Rec1 {
    static void print(int n)
    {
        System.out.println(n);
        if(n==1)
        {
            return;
        }
        print(n-1);
    }
    public static void main(String[] args) {
        print(5);
    }
}
