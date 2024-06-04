public class PalindRec {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(123));
    }
    static int ans(int s)
    {
           return (int)Math.pow(10,s-1);
    }
    static int revNum(int num)
    {
        if(num%10==num)
        {
            return num;
        }
        return (num%10)*ans(Integer.toString(num).length())+revNum(num/10);
    }
    static boolean checkPalindrome(int num)
    {
           if(num == revNum(num))
           {
            return true;
           }
           return false;
    }
}
