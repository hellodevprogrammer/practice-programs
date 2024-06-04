package Recursion;
import java.math.*;
public class NoOfDigits {
    public static void main(String[] args) {
        int n = 3456721;
        int b = 10;
        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
       System.out.println(ans);
    }
}
