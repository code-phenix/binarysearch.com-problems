// Given a lowercase alphabet string s, determine whether it has all unique characters.

// Constraints

// 0 ≤ n ≤ 100,000 where n is the length of s
// Example 1
// Input
// s = "abcde"
// Output
// true
// Explanation
// All characters only occur once

// Example 2
// Input
// s = "aab"
// Output
// false
// Explanation
// There's two as

// Example 3
// Input
// s = ""
// Output
// true
// Explanation
// All characters occur once (of which there are none)

import java.util.HashMap;

class Solution {
    public boolean solve(String s) {
        HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(!hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i),1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
