import java.util.ArrayList;

public class ListLinearRec {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int a[]={10,20,20,30,41,32,30,30,56};
        System.out.println(searchElement(a, 30, 0, list));
    }
    static ArrayList<Integer> searchElement(int[] a,int target,int index,ArrayList<Integer> list)
    {
        if(index==a.length)
        {
            return list;
        }
        if(a[index]==target)
        {
            list.add(index);
        }
        return searchElement(a, target, index+1, list);
    }
}
