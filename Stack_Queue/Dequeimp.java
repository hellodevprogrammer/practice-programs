import java.util.*;
public class Dequeimp {
    public static void main(String[] args) {
        Deque<Integer> d1= new ArrayDeque<>();//ArrayDeque provide object for used deque interface method
        d1.add(10);
        d1.add(20);
        d1.addFirst(30);
        
        System.out.println(d1.pop());
    }
}
