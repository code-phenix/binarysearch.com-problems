// Given a list of positive integers nums, return the number of integers that have odd number of digits.

// Constraints

// n ≤ 100,000 where n is the length of nums
// Example 1
// Input
// nums = [1, 800, 2, 10, 3]
// Output
// 4
// Explanation
// [1, 800, 2, 3] have odd number of digits.

import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i],tempCount=0;
            while(temp>0){
                tempCount++;
                temp=temp/10;
            }
            if(tempCount%2!=0)
                ans++;
    }
    return ans;
}
}
//Your code took 161 milliseconds — faster than 87.56% in Java
