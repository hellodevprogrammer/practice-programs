import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ob.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Serialization s = (Serialization)ois.readObject();
            s.displayName();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
