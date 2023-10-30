// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.



// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
         ans[i] = arr[i] + ans[i-1];   
        }
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
