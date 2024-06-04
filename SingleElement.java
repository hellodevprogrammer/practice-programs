public class SingleElement {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(a));
    }
    public static  int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid + 1] && nums[mid] < nums[mid - 1])
            {
                return nums[mid];
            }
            if(nums[mid] == nums[mid - 1] && (mid + 1) % 2 == 0)
            {
                
                    start = mid + 1;
                
                end = mid;
            }
            if(nums[mid] == nums[mid + 1] && (nums.length - mid) % 2 == 0)
            {
                
                    end = mid - 1;
            
                start = mid;

            }
        }
        return 0;
    }
}
