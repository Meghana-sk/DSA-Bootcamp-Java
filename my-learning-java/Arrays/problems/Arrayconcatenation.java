// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.



// Example 1:

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]

class Main{
    public static int[] arrayConcatenation(int[] nums){
        int []ans = new int[2*nums.length];
        for(int i = 0; i < 2* nums.length; i++){
            ans[i] = i < nums.length ? nums[i] : nums[i - nums.length];
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1};
        int []ans = new int[2*arr.length];
        ans = arrayConcatenation(arr);
        for(int i = 0; i < ans.length; i++)
        System.out.println(ans[i]);
    }
}