public class TriangleRec {
    public static void main(String[] args) {
        printStar(0, 4);
    }
    static void star(int s)
    {
        if(s==1)
        {
            System.out.print(" * ");
            System.out.println();
             return;
        }
        System.out.print(" * ");
        star(--s);
    }
    static void printStar(int r,int c)
    {
        if(c==1)
        {
           star(c);
           return;
        }
        star(c);
        printStar(++r, --c);
    }
}
