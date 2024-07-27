import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a1[] = {10,20,30};
        int a2[] = {5,15,25};
        // System.out.println(Arrays.toString(mergeArrays(a1, a2)));
        System.out.println(mergeArrays(a1, a2));
    }
    public static int mergeArrays(int []a1 , int []a2){
        int a3[] = new int[a1.length + a2.length];
        int p1 = 0;
        int p2=0;
        int p3=0;
        int tsize = a1.length + a2.length;
        while(p1 < a1.length && p2 < a2.length){
             if(a1[p1] < a2[p2]){
                a3[p3++] = a1[p1++];
             }
             else{
                a3[p3++] = a2[p2++];
             }
        }
        while (p1 < a1.length) {
            a3[p3++] = a1[p1++];
            
        }
        while (p2 < a2.length) {
            a3[p3++] = a2[p2++];
            
        }
        if(tsize % 2 == 1){
            return a3[tsize / 2];
        }
        else{
            
            int ans = (int)Math.ceil((double)a3[tsize / 2] + (double)a3[(tsize/2 -1)])/2; 
            return  ans;
        }
        
    }
}
