@FunctionalInterface
interface Demo{
    void show(String s);
}
public class Lambda {
    public static void main(String[] args) {
        Demo d = s->  System.out.println(s);
        
        d.show("radhe radhe");
    }
}
