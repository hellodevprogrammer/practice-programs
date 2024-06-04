package String_Buffer;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        int n= 20;
        String name = generateString(5);
        System.out.println(name);

    }

    static String generateString(int size)
    {
           StringBuffer sb =new StringBuffer(size);
           Random ran = new Random();
           for (int i = 0; i < size; i++) {
            int randomChar = 97+(int)(ran.nextFloat()*26);
            sb.append((char)randomChar);
           }           
           return sb.toString();
    }
   
}
