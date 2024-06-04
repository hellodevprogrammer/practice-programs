import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("enter any string");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         System.out.println(checkPalindrome(s));
    }

    static boolean checkPalindrome(String str)
    {
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(end)==str.charAt(start))
            {
                start=start+1;
                end=end-1;
            }
            else{
                return false;
            }
        }
       return true;
    }

}
