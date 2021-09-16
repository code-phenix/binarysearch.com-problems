// You are given a string s where each character is "L" meaning you moved one unit left, "R" meaning you moved one unit right, or "?" meaning either "L" or "R".

// Given you are at position 0, return the maximum possible distance you could be from 0 by replacing "?" with "L" or "R".

// Constraints

// 0 ≤ n ≤ 100,000 where n is the length of s
// Example 1
// Input
// s = "LLRRR??"
// Output
// 3
// Explanation
// We can replace the two "?" with "R" to move 5 units right and 2 units left, for a total distance of 3 units from 0.

class Solution {
    public int solve(String s) {
        int lCount=0,rCount=0,qCount=0;
        for(int iterI=0;iterI<s.length();iterI++){
            if(s.charAt(iterI)=='L')
                lCount++;
            else if(s.charAt(iterI)=='R')
                rCount++;
            else
                qCount++;
        }
        if(lCount>rCount)
            lCount+=qCount;
        else
            rCount+=qCount;
        return lCount-rCount>=0?lCount-rCount:rCount-lCount;
    }
}

//Your code took 8 milliseconds — faster than 100.00% in Java
  
