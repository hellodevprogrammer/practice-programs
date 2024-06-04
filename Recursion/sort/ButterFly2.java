package Recursion.sort;

public class ButterFly2 {
    public static void main(String[] args) {
        for(int i = 1;i <= 4;i++ )
        {
            for(int j = 1; j <= i ; j++)
            {
                System.out.print(" * ");
            
            }
            for(int k=1; k <= 8 - (2 * i -1) ; k++)
            {
            System.out.print("   ");
            }
            for(int d = 1; d <= i ; d++)
            {
                System.out.print(" * ");
            
            }
            System.out.println();
           
        }
        for(int l = 1 ; l <= 9 ; l++)
        {
            System.out.print(" * ");
        }
        System.out.println();
        for(int m = 4 ; m >= 1 ; m-- )
        {
            for(int n = 1 ; n <= m ; n++ )
            {
                System.out.print(" * ");
            }
            for( int o =1; o <= ( 2* (5 -m)) -1; o++)
            {
                System.out.print("   ");
            }
            for(int p = 1 ; p <= m ; p++ )
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
