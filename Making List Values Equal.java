// You are given a list of integers nums. Consider an operation where we select some subset of integers in the list and increment all of them by one.

// Return the minimum number of operations needed to make all values in the list equal to each other.

// Constraints

// 1 ≤ n ≤ 100,000 where n is the length of nums
// 0 ≤ nums[i] ≤ 10**9 for all 0 ≤ i < n
// Example 1
// Input
// nums = [1, 3, 0]
// Output
// 3
// Explanation
// The 3 operations we can take are:

// Increment [1, 0] to get [2, 3, 1]
// Increment [2, 1] to get [3, 3, 2]
// Increment [2] to get [3, 3, 3]

class Solution {
    public int solve(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int iterI=0;iterI<nums.length;iterI++){
            if(min>nums[iterI]){
                min=nums[iterI];
            }
            if(max<nums[iterI]){
                max=nums[iterI];
            }
        }
        return max-min;
    }
}

//Your code took 75 milliseconds — faster than 96.55% in Java
