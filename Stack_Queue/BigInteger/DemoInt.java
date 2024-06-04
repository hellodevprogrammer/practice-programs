package BigInteger;
import java.math.BigInteger;
public class DemoInt {
    public static void main(String[] args) {
        BigInteger A = BigInteger.valueOf(1234); //int to BI
        int x = A.intValue();// BI to int /long
        BigInteger B = BigInteger.valueOf(1);
        BigInteger D = new BigInteger("1234567891234565212");
        BigInteger X= new BigInteger("3215456123");
        BigInteger C = D.add(B);
        BigInteger sub = D.subtract(X);
        BigInteger MUL = D.multiply(X);
        BigInteger DIV = D.divide(X);

        System.out.println(C);
        System.out.println(sub);
        System.out.println(MUL);
        System.out.println(DIV);


    }
}
