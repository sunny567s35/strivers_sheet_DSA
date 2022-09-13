import java.util.*;
class Solution {
    public int msa(int[] nums){
        int maxi = nums[0];
        int sum =0 ;
        int n = nums.length;
        for(int i =0 ; i< n ; i++){
            sum += nums[i];
            if(sum > maxi)maxi= sum;
            if(sum <0)sum=0;
        }
    return maxi ;
        }
}
 public class maxSubArray {
   public static void main(String[] args){
    int arr[] = {1,3,2,5,4};
    Solution obj = new Solution();
    System.out.println(obj.msa(arr));
   }
}
