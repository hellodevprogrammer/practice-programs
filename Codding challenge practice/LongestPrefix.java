import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
       String ss[] ={ "flower","flow","flight"};
           Arrays.sort(ss);
           String ans = "";
        String v1 = ss[0];        
        String l1 = ss[ss.length-1];
        for (int i = 0; i < Math.min(v1.length() , l1.length()); i++) {
            if(v1.charAt(i) == l1.charAt(i) ){
                ans+=v1.charAt(i);
            }
        }
        System.out.println(ans);

    }
    // public static String longestCommonPrefix(String[] strs){
    //     for
    // }
}
