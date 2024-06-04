package Recursion.Basic;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(prime(19));
    }
    public static boolean prime(int num)
    {
        if(num == 1 || num== 0)
        {
            return false;
        }
         for(int i = 2; i<=(int)Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
