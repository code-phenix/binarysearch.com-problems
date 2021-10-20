// Given a lowercase alphabet string s, return the length of the longest substring with same characters.

// Constraints

// 0 ≤ n ≤ 100,000 where n is the length of s
// Example 1
// Input
// s = "abbbba"
// Output
// 4
// Explanation
// The longest substring is "bbbb".

// Example 2
// Input
// s = "aaabbb"
// Output
// 3

class Solution {
    public int solve(String s) {
        int max=1,cur=1,size=s.length();
        if(size==0)
            return 0;
        for(int iterI=1;iterI<size;iterI++){
            if(s.charAt(iterI-1)==s.charAt(iterI))
                cur++;
            else{
                if(cur>max){
                    max=cur;
                }
                cur=1;
            }
        }
        if(cur>max){
            max=cur;
        }
        return max;
    }
}
//Your code took 15 milliseconds — faster than 66.91% in Java
