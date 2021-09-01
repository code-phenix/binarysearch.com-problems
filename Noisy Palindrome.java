// You are given a string s containing lowercase and uppercase alphabet characters as well as digits from "0" to "9". Return whether s is a palindrome if we only consider the lowercase alphabet characters.

// Constraints

// 0 ≤ n ≤ 100,000 where n is the length of s
// Example 1
// Input
// s = "a92bcbXa"
// Output
// true
// Explanation
// If we only consider the lowercase characters, then s is "abcba" which is a palindrome.

// Example 2
// Input
// s = "abZ"
// Output
// false

class Solution {
    public boolean checkLower(char ch){
        if(ch>='a'&&ch<='z')
            return true;
        return false;
    }
    public boolean solve(String s) {
        int startPointer=0,endPointer=s.length()-1;
        while(startPointer<=endPointer){
            while(!checkLower(s.charAt(startPointer)) && startPointer<endPointer){
                startPointer++;
            }
            while(!checkLower(s.charAt(endPointer)) && startPointer<endPointer){
                endPointer--;
            }
            if(s.charAt(startPointer)!=s.charAt(endPointer)){
                return false;
            }
            else{
                startPointer++;
                endPointer--;
            }
    }
    return true;
}
}
//Your code took 13 milliseconds — faster than 99.43% in Java
