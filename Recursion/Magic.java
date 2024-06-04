package Recursion;

public class Magic {
    public static void main(String[] args) {
        int n = 6;
        
        int ans=0;
        int base = 5;
         while( n > 0)
         {
            int temp = n & 1;
            n = n >> 1;
            ans = ans + base * temp;
            base = base * 5; 
         }

        System.out.println(ans); 
    }
}
