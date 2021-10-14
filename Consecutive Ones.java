// You are given a list of integers nums which contains at least one 1. Return whether all the 1s appear consecutively.

// Constraints

// 1 ≤ n ≤ 100,000 where n is the length of nums
// Example 1
// Input
// nums = [0, 1, 1, 1, 2, 3]
// Output
// true
// Explanation
// All the 1s appear consecutively here in the middle.

// Example 2
// Input
// nums = [1, 1, 0, 1, 1]
// Output
// false
// Explanation
// There's two groups of consecutive 1s.

class Solution {
    public boolean solve(int[] nums) {
        boolean flag=true;
        int start=0,end=0,count=0;
        for(int iterI=0;iterI<nums.length;iterI++){
            if(nums[iterI]==1){
                if(flag){
                    start=iterI;
                    flag=false;
                }
                    end=iterI;
                count++;
            }
        }
        return count==(end-start+1);
}
}

//Your code took 89 milliseconds — faster than 98.74% in Java
