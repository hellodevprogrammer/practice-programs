import java.util.*;
public class QueueImp {
    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<>();
       
         q1.add(20);
         q1.add(30);
         q1.add(40);
         q1.add(50);
         System.out.println(q1.remove());
         System.out.println(q1.remove());
         System.out.println(q1.remove());
         System.out.println(q1.remove());
         System.out.println(q1.remove());
    }
}
