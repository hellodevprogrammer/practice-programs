package Recursion;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
    static boolean isPrime(int num)
    {
       if(num <= 1)
       {
        return false;
       }
       int c = 2;

       while (c * c <= num) {
        if(num % c==0)
        {
            return false;
        }
        c++;
       }
       return true;
    }
}
