package BigInteger;

import java.math.BigInteger;

public class FactorialBig {
    public static void main(String[] args) {
        System.out.println(recFact(13));
    }
    static BigInteger fact(int num)
    {
          BigInteger ans = new BigInteger("1");
          for (int i = 2; i <= num; i++) {
            ans=ans.multiply(BigInteger.valueOf(i));
          }
          
          return ans; 
    }
    static BigInteger recFact(int num)
    {
           if (num == 0 || num ==1) {
            BigInteger ans = new BigInteger("1");
            return ans;
           }

          return BigInteger.valueOf(num).multiply(recFact(num - 1 )); 
    }
}
