package Recursion;

public class Lcm {
        public static void main(String[] args) {
            System.out.println(lcmNum(21, 14));

        }
        static int lcmNum(int n1,int n2)
        {
            int lcm= (n1>n2) ? n1 :n2;
            while(true)
            {
                if(lcm % n1 == 0 && lcm % n2 ==0 )
                {
                    break;
                }
                ++lcm;
            }
            return lcm;
        }
}
