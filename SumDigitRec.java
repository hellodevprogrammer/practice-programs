public class SumDigitRec {
    public static void main(String[] args) {
       System.out.println(sumDigits(542)); 
    }
    static int sumDigits(int num)
    {
        if(num==0)
        {
            return num;
        }
        return num%10+sumDigits(num/10);
    }
}
