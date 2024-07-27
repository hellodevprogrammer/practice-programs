import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
     
        try {
            Serialization s = new Serialization("Dev","dev@gmail.com",21,"shubham place");
            FileOutputStream fo = new FileOutputStream("ob.txt");
         
        ObjectOutputStream os = new ObjectOutputStream(fo);

        //how to serialize
        os.writeObject(s);
        os.close();
        fo.close();
        System.out.println("object state is transfered to ob");
        } catch (Exception e) {
            e.printStackTrace();
            
        }
       

    }
}
