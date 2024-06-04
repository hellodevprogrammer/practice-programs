public class PrintRec {
    public static void main(String[] args) {
        printRevNum(5);
    }
    static void printRevNum(int num)
    {
        if(num==1)
        {
            System.out.print(num+" ");
            System.out.println();
            System.out.print(num+" ");

            return;
        }
        System.out.print(num+" ");
        printRevNum(num-1);
       
        System.out.print(num+" ");
        
    }
}
