package LinkedList;

public class Stock {
    public static void main(String[] args) {
        int price[] = {7 , 1 , 5 , 3 , 6 ,4 };
        int min = price[0];
        int max = 0;

        for (int i = 0; i < price.length; i++)
         {
          if(price[i] - min > max)
          {
              max = price[i] - min;
          }       
          if(price[i] < min)
          {
            min = price[i];
          }
        }
        System.out.println(max);
    
    }
}
