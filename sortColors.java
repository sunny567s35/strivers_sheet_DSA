// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
class Solution {
    public void sortColors(int[] nums) {
        int i,j , temp ;
        for(i=0 ;i<nums.length;i++){
        for(j=0;j<nums.length-1;j++){
            if(nums[j]>nums[j+1]){
                swap(nums,j);
                
            }
        }
        }
    }
    public void swap(int [] arr , int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] =temp;
            
    }
}
public class sortColors {
    public static void main(String[] args) {
        Solution o = new Solution();
        int [] nums = {1,0,1,2,2,1,0};
        o.sortColors(nums);
        System.out.println(nums);
    }
}
