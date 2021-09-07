// Given a list of integers nums, find the most frequently occurring element and return the number of occurrences of that element.

// Constraints

// 0 ≤ n ≤ 100,000 where n is the length of nums
// Example 1
// Input
// nums = [1, 4, 1, 7, 1, 7, 1, 1]
// Output
// 5
// Example 2
// Input
// nums = [5, 5, 5, 5, 5, 5, 5]
// Output
// 7
// Example 3
// Input
// nums = [1, 2, 3, 4, 5, 6, 7]
// Output
// 1

import java.util.HashMap;

class Solution {
    public int solve(int[] nums) {
        if(nums.length<=0)
            return 0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        int max=1;
        for(int i:nums){
            if(hs.containsKey(i)){
                hs.put(i,(hs.get(i)+1));
                if(hs.get(i)>max)
                    max=hs.get(i);
            }
            else{
                hs.put(i,1);
            }
        }
        return max;
    }
}

//Your code took 14 milliseconds — faster than 100.00% in Java
