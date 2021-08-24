// Given a string s, return whether it is a palindrome.

// Constraints

// n ≤ 100,000 where n is the length of s
// Example 1
// Input
// s = "racecar"
// Output
// true
// Example 2
// Input
// s = "evilolive"
// Output
// true
// Example 3
// Input
// s = "palindrome"
// Output
// false

import java.util.*;

class Solution {
    public boolean solve(String s) {
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}

// Your code took 1 millisecond — faster than 100.00% in Java
