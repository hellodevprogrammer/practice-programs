public class Bill {
    public static void main(String[] args) {
        int amount=350;
        int bill=0;
        int rs=5;
        while(amount>0)
        {
            if(amount<100)
            {
                bill=bill+amount*rs;
                amount=0;
            }
          else{
            bill=bill+100*rs;
            amount=amount-100;
            rs=rs+5;
          }
        }
        System.out.println("total bill is : "+bill);
    }
   
}
