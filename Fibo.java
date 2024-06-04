public class Fibo {
    static int  printFibo(int n)
    {
       if(n<2)
       {
        return n;
       }
       return printFibo(n-1)+printFibo(n-2);

    }
    public static void main(String[] args) {
      
        System.out.println(printFibo(5));;
    }
}
