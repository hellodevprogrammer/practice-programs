package Pattern;

public class Pyramid3 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1; i <= 5 ;i++ )
        {
            for(int j = 1 ; j <= 5 - i ;j++)
            {
                System.out.print(" ");
            }
            if(i != 1 && i != 5)
            {
                System.out.print("*");
                for(int k = 1 ; k <= count ; k++)
                {
                    System.out.print(" ");
                }
                count +=2;
                System.out.print("*");
            }
           if(i == 1 || i== 5)
           {
            for(int l = 1 ; l <= 2 * i - 1 ; l++)
            {
                System.out.print("*");
            }
           }
           System.out.println();
        }
    }
}
