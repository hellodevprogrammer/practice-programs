package Recursion;

public class SumOfPascalRow {
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("enter the  number ");
        int num = sc.nextInt();
        if( (num & num-1) == 0)
        {
            System.out.println("number is the power of two");
        }
        else
        {
            System.out.println("number is not a power of two ");
        }
    }
}
