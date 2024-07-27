import java.util.Arrays;

public class RotateString {
    public static void main(String[] args) {
         // System.out.println(rotateString("abcde", "bcdea"));
          String s = "rat";
          String t = "cat";
          char ch1[] =s.toCharArray();
          Arrays.sort(ch1);
          char ch2[] =t.toCharArray();
          Arrays.sort(ch2);
          if(Arrays.toString(ch1).equals(Arrays.toString(ch2))){
            System.out.println("anagram");
          }
          else{
            System.out.println("not an anagram string");
          }
      }
    public static boolean rotateString(String s ,String goal){
        if(s.length() != goal.length()){
            return false;
        }
       for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(0);
          s = s.substring(1, s.length()-1) + c;
          if(s.equals(goal)){
            return true;
          }
       }
       return false;
    }
    // public static boolean isAnagram(String s , String t){
    //     if(s.length() != t.length()){
    //         return false;

    //     }

    // }
}
