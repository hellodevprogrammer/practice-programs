
class Solution {
    int count(int[] nums, int n, int x) {
        // code here
       int l=0;
       int r= nums.length-1;
       while(l <=r){
           if(nums[l]!=x){
               l++;
           }
           if(nums[r]!=x){
               r--;
           }
           if(nums[l] == x && nums[r] == x){
               break;
           }
       }
       if(r < l){
           return 0;
           
       }
       return r-l+1;
       
    }
}