package Recursion;

public class PerRec {
    public static void main(String[] args) {
        System.out.println(countPermutations("", "abc"));
    }
    static void permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);

            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
        
    }
    static int countPermutations(String p,String up)
    {
        if(up.isEmpty())
        {
            // System.out.println(p);

            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+  countPermutations(f+ch+s,up.substring(1));
        }
        return count;
        
    }
}