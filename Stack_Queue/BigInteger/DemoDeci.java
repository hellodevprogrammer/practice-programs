package BigInteger;

import java.math.BigDecimal;

public class DemoDeci {
    public static void main(String[] args) {
        
    }
    static void BD()
    {
        BigDecimal X= new BigDecimal("0.03");
        BigDecimal Y= new BigDecimal("0.04");
        BigDecimal ans= X.add(Y);
        System.out.println(ans);
    }
}
