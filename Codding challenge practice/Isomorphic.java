import java.util.*;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Set<Character> ss = new HashSet<Character>();
        Set<Character> tt = new HashSet<Character>();
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        for (int i = 0; i < d.length; i++) {
            ss.add(c[i]);
            tt.add(d[i]);
        }
        return ss.size() == tt.size();

    }
}