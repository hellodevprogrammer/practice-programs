package Recursion;

public class BasePower {
    public static void main(String[] args) {
        int base = 3;
        int ans =  1;
        int power = 4;
        while (power > 0) {
             if( (power & 1) == 1)
             {
             ans = ans * base;
            
            
             }
             power=power>>1;
             base *=base;
        }
        System.out.println(ans);
    }
}
