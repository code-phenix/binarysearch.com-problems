// Given a list of integers nums, return whether there's an integer whose frequency in the list is same as its value.

// Constraints

// n ≤ 100,000 where n is the length of nums
// Example 1
// Input
// nums = [7, 9, 3, 3, 3]
// Output
// true
// Explanation
// The number 3 appears 3 times.

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solve(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:nums){
            // if(i==1)
            //     return true;
            if(!hs.containsKey(i)){
                hs.put(i,1);
            }
            else{
                int temp=hs.get(i);
                temp++;
                hs.put(i,temp);
            }
        }
        for(Map.Entry val:hs.entrySet()){
            if(val.getKey()==val.getValue())
                return true;
        }
        return false;
    }
}
//Your code took 243 milliseconds — faster than 95.87% in Java
