package Recursion;

public class Leap {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1984));
    }
    static boolean isLeapYear(int year)
    {
           if(year % 4 ==0 ||year%100==0 && year % 400==0)
           {
            return true;
           }
           return false;
    }
}
