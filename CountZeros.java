public class CountZeros {
    // static int count=0;
    static int checkZero(int num,int count)
    {
        if(num==0)
        {
            return count;
        }
        if(num%10==0)
        {
            return checkZero(num/10, ++count);
        }
        else
        {
            return checkZero(num/10, count);
        }
    }
    public static void main(String[] args) {
        int ans=checkZero(30204000,0);
        System.out.println(ans);
    }

}
