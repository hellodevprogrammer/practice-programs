public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
        
    }
    public static int myAtoi(String s){
         s=s.trim();
         if(s.length() ==0){
            return 0;
         }
         String ans = "";
         if(((int)s.charAt(0) >=48 && (int)s.charAt(0)<=57 ) || (int)s.charAt(0) == 45   ){
            for (int i = 0; i < s.length(); i++) {
                if(i==0 && (int)s.charAt(0) == 45 ){
                    ans+=s.charAt(0);
                }
                else if((int)s.charAt(i) >=48 && (int)s.charAt(i) <=57 ){
                   ans+=s.charAt(i);
                }
                else{
                    break;
                }
            }
         }else{
            return 0;
         }
        
         if( Long.parseLong(ans) > 0 &&  Long.parseLong(ans)>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
         }
         if( Long.parseLong(ans) < 0 &&  Long.parseLong(ans)<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
         }
        return  (int)Long.parseLong(ans);
    }
}
