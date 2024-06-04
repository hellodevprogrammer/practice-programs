public class LinearRec {
    public static void main(String[] args) {
        int[] a={3,2,1,18,9};
        System.out.println(linearRecSearch(a, 18, 0));
    }
    static int linearRecSearch(int[] a,int target,int index)
    {
        if(index == a.length)
        {
            return -1;
        }
        if(a[index]==target)
        {
            return index;
        }
        return linearRecSearch(a, target, index+1);
    }
}
