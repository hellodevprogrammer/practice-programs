public class SubString {
    public static void main(String[] args) {
        // skip("", "baccad");
        System.out.println(skipApple("demoappleds"));
    }
    static void skip(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch=='a')
        {
            skip(p, up.substring(1));
        }
        else{
            skip( p + ch, up.substring(1));
        }
    }
    static String skipApple(String s)
    {
        if(s.isEmpty())
        {
                return "";
        }
        if(s.startsWith("apple"))
        {
            return skipApple(s.substring(5));
        }
        else
        {
            return s.charAt(0)+skipApple(s.substring(1));
        }
    }
}
