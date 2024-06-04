public class FactRev {
    public static void main(String[] args) {
        System.out.println(fact(0));;
    }
    static int fact(int num)
    { 
       if(num==1)
       {
        return num;
       }
       return fact(num-1)*num;
    }
}
