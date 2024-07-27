import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
           rotate(x);
        // for (int[] is : y) {
        //     System.out.println(Arrays.toString(is));
        // }
        // String s = "0000001311110111111000";
        // int a[] ={3,0,1};
        // int a1[]={-8 ,-3 ,-3 ,-2, 0 ,1, 2 ,2 ,6};
        // int a2[] = {-9,-9,0};
        // System.out.println(findUnion(a1, a2, 9, 3));
        // moveZeroes(a);
        // System.out.println(secLarge(a));
    //    System.out.println(removeDuplicates2(a));
        // System.out.println(maxOccur(s));
        // System.out.println(largest(a, a.length));
        // rotate2(a, 2);
        // moveZeroes(a);
        // System.out.println(missingNumber(a));
        //   int x[] = {16,17,4,3,5,2};  
        //  System.out.println(maxProfit(x));
    //    System.out.println(pairWithMaxSum(x));
    // System.out.println(Arrays.toString(rearrangeArray(x)));
    // System.out.println(leaders(x, x.length));
     }
     public static void rotate(int[][] matrix) {
        int newMatrix[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newMatrix[j][matrix.length -1 -i] = matrix[i][j];
            }
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
        
     }
     public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
     {
         // Arraylist for storing reversed elements
         // this.revArrayList = alist;
         for (int i = 0; i < alist.size() / 2; i++) {
             Integer temp = alist.get(i);
             alist.set(i, alist.get(alist.size() - i - 1));
             alist.set(alist.size() - i - 1, temp);
         }
  
         // Return the reversed arraylist
         return alist;
     }
     //Function to find the leaders in the array.
     static ArrayList<Integer> leaders(int arr[], int n){
         // Your code here
         ArrayList<Integer> ans = new ArrayList<>();
         ans.add(arr[n - 1]);
         for(int i = n -2 ; i>=0;i--){
             if(arr[i] >= ans.get(ans.size() - 1)){
                 ans.add(arr[i]);
             }
         }
         return reverseArrayList(ans);
     }
     public static void swapNumber(int nums[] , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

     }
     public static int[] rearrangeArray(int[] nums) {
        int ptr= 0;
        int ntr = 1;
        int ans[] = new int[nums.length];
        for(int  i = 0; i < nums.length ; i++){
           if(nums[i] > 0){
             ans[ptr] = nums[i];
             ptr+=2;
           }else{
             ans[ntr] = nums[i];
             ntr+= 2; 
           }
 
        }
        return ans;
    }
    public static int pairWithMaxSum(int arr[])
    {
       int sum = 0;
       int maxSum = 0;
       for (int i = 0; i < arr.length -1; i++) {
        sum = arr[i] + arr[i + 1];
        if(sum > maxSum){
            maxSum=sum;
        }
        if(sum <  0){
            sum = 0;
        }
       }
       return maxSum;
    }
    public static int maxProfit(int[] prices) {
        int profit=0;
        int min = prices[0];
        for(int i = 1;i<prices.length;i++){
           profit = Math.max(profit,prices[i] - min);
           if(min > prices[i]){
            min = prices[i];
           }
        }
        return profit;
    }
    public static int[] ans(int a[]){
         Arrays.sort(a);
         return a;
    }
    // public int[] twoSum(int[] nums, int target) {
    //  int sum = 0;
    //  for(int i = 0 ;i<nums.length;i++){
    //     for (int j = i+1; j < nums.length; j++) {
              
    //     }
    //  }   
    // }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> list =  new ArrayList<>();
        int p1 = 0;
        int  p2 = 0;
        while(p1 < n && p2 < m){
            
            if(arr1[p1] >= arr2[p2]){
                if(list.size() == 0 || list.get(list.size() -1) != arr2[p2]){
                    list.add(arr2[p2]);
                    p2++;
                }
            }else{
                if(list.size() == 0 || list.get(list.size() -1) != arr1[p1]){
                    list.add(arr1[p1]);
                    p1++;
                }
            }
        }
        
            
            while(p1 < n){
                if( list.get(list.size() -1) != arr1[p1]){
                    list.add(arr1[p1]);
                    p1++;
                }
            }
            
       
      
            
            while(p2 < m){
                if( list.get(list.size() -1) != arr2[p2]){
                    list.add(arr2[p2]);
                    p2++;
                }
            }
        
        return list;
    }
    static void swap(int[] a,int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
    public static  int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct] )
            {
              swap(nums,i,correct);
            }
           else
           {
               i++;   
           }
               
            
        }
         
         for(int index=0;index<nums.length;index++)
         {
             if(index!=nums[index])
             {
                 return index;
             }

         }
         return nums.length;

    }
    public static int secLarge(int a[]){
        int flarge = -1;
        int slarge = -1;
        for(int i = 0;i<a.length;i++){
            if(a[i] > flarge){
                slarge = flarge;
                flarge= a[i];
            }
        }
        return slarge;
    }
    public static  void moveZeroes(int[] nums) {
        int h1 = 0;
        int h2 = nums.length -1;
        while(h1 < nums.length -1){
            if(nums[h1] == 0){
                for(int i=h1; i< h2;i++){
                    nums[i] = nums[i+1];
                }
                nums[h2]= 0;
                h2--;
            }else{
                h1++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static  void moveZeroes2(int[] nums) {
        int count = 0;
        for(int i =0;i< nums.length;i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];

            }
        }
        for(int i = count;i < nums.length;i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
   static  public int[] rotate(int[] nums, int k) {
        for(int i = 1;i<= k ; i++){
            int temp = nums[nums.length -1];
            for (int j = nums.length -2; j >= 0; j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = temp;

        }
    return nums;
    }
   static  public void rotate2(int[] nums, int k) {
    int ans[]  = new int[nums.length];   
    int count = k;

    for(int  i =0 ; i < k ; i++){
        
             ans[count -1] = nums[nums.length - 1 -i];
             count--;
        }
        for (int i = 0; i < nums.length-k; i++) {
            ans[i+k] = nums[i];
        }

      nums = ans;
      System.out.println(Arrays.toString(nums));
    }
    static public int removeDuplicates(int[] nums) {
        int h1 = 0;
        int h2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length == 0){
            return 0;
        }
        list.add(nums[0]);
        for (int i = 0; i < nums.length; i++) {
            if(nums[h1] == nums[h2]){
                h2++;
            }
            else{
                  list.add(nums[h2]);
                  nums[++h1] = nums[h2];
                  h2++;
            }
        }
        return list.size();
    }
    static public int removeDuplicates2(int[] nums) {
        int count = 0;

        for(int x : nums){
            if(nums[count] != x){
                nums[++count] = x;
            }
        }
        return ++count;
        
    }
    static  int largest(int arr[], int n) {
        int large = arr[0];
        for(int i= 0;i<arr.length;i++){
            if(arr[i] > large){
                large=arr[i];
            }
        }
        return large;
    }
    public static int maxOccur(int[] s) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 1) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }
}

