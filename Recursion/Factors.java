package Recursion;

public class Factors {
    public static void main(String[] args) {
        int n = 40;
        for( int i =2 ; i <= n/2 ; i++)
        {  
            if( n % i == 0)
            {
                System.out.println(i);
            }

        }
    }
}
