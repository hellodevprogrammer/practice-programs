package String_Buffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb =new StringBuffer();
        //constructor 2
        StringBuffer sb2 =new StringBuffer("dev shinde ");
        //constructor
        StringBuffer sb3 =new StringBuffer(34);
        // sb2.append("amazon ");

        sb2.insert(10, " is a Java Developer");
        //  sb2.replace(16, 21, "Full Stack ");
        sb2.delete(16, 21);
        // sb2.reverse();
       
       
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        String  sb7 = "dev shinde is a great person";
        System.out.println(sb7);
        System.out.println(sb7.replaceAll("\\s",""));

         //split

         String str="dev deepak raam sagar divyam";
         System.out.println(Arrays.toString(str.split(" ")));

         //rounding off

         DecimalFormat df =new DecimalFormat("0.000000");
         System.out.println(df.format(7.89));
    }
}
