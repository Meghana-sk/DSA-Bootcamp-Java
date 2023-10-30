// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.



// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

import java.util.Arrays;
class Main{
    public static int numIdenticalPairs(int[] nums) {
        int goodPairCount = 0;
        // BRUTE FORCE APPROACH
        // for (int i = 0; i < nums.length; i++) {
        //     for(int j = 0; j < nums.length; j++) {
        //         if(i < j) {
        //             if(nums[i] == nums[j]){
        //                 goodPairCount++;
        //             }
        //         }
        //     }
        // }
        int []map = new int[101];
        Arrays.fill(map, 0);
        for(int i = 0; i < nums.length; i++){
            goodPairCount += map[nums[i]]++;
        }
        return goodPairCount;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1,1,3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }
}
