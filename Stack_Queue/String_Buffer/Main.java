package String_Buffer;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //constructor 1
        // StringBuffer sb =new StringBuffer();
        // //constructor 2
        // StringBuffer sb2 =new StringBuffer("dev shinde ");
        // //constructor
        // StringBuffer sb3 =new StringBuffer(34);
        // // sb2.append("amazon ");

        // sb2.insert(10, " is a Java Developer");
        // //  sb2.replace(16, 21, "Full Stack ");
        // sb2.delete(16, 21);
        // // sb2.reverse();
       
       
        // System.out.println(sb2);
        // System.out.println(sb2.capacity());
        // String  sb7 = "dev shinde is a great person";
        // System.out.println(sb7);
        // System.out.println(sb7.replaceAll("\\s",""));

        //  //split

        //  String str="dev deepak raam sagar divyam";
        //  System.out.println(Arrays.toString(str.split(" ")));

        //  //rounding off

        //  DecimalFormat df =new DecimalFormat("0.000000");
        //  System.out.println(df.format(7.89));

        // String s = "dev shinde is a java fullstack developer";
        // //  System.out.println(Arrays.toString(s.split(" ")));
        // String strs[] = s.split(" ");
        // // String s1 = Arrays.toString(strs);
        //  int low = 0;
        //  int high = strs.length -1;
        //  while(low <= high){
        //     String temp = strs[low];
        //     strs[low] = strs[high];
        //     strs[high] = temp;
        //     low++;
        //     high--;
        //  }
        //  s = "";
        // for (String string : strs) {
        //     s=s+string;
        // }
        // 
        String str="35427";
        String ans = "";
      for(int i = str.length() -1;i>=0 ; i--){
  
            if((int)str.charAt(i) % 2 == 1  ){
                ans = str.substring(0, i+1);
                break;
            }
      }
      System.out.println(ans);
      String[] strings = {"DEvenrapatidar" ,"ha","mahendra"};  
    //    System.out.println(Arrays.toString());
    Arrays.sort(strings);
    System.out.println(Arrays.toString(strings));
    } 
}
