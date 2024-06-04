package Recursion.Basic;

public class PrintDiv {
    public static void main(String[] args) {
         printDiv(36);
    }
    public static void printDiv(int num)
    {
        for (int i = 1; i < (int)Math.sqrt(num); i++) {
            if(num % i == 0)
            {
                System.out.print(i+" ");
                if(i != num/i)
                {
                    System.out.print(num/i+" ");
                }
            }
            
            
        }
    }

}
