// Given a string s, return its run-length encoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters.

// Constraints

// n ≤ 100,000 where n is the length of s
// Example 1
// Input
// s = "aaaabbbccdaa"
// Output
// "4a3b2c1d2a"
// Example 2
// Input
// s = "abcde"
// Output
// "1a1b1c1d1e"
// Example 3
// Input
// s = "aabba"
// Output
// "2a2b1a"
// Example 4
// Input
// s = "aaaaaaaaaa"
// Output
// "10a"

class Solution {
    public String solve(String s) {
        StringBuilder res=new StringBuilder();
        char pre=s.charAt(0);
        int size=s.length(),count=1;
        for(int iterI=1;iterI<size;iterI++){
            if(pre==s.charAt(iterI)){
                count++;
            }
            else{
                res.append(String.valueOf(count));
                res.append(pre);
                count=1;
            }
            pre=s.charAt(iterI);
        }
        res.append(String.valueOf(count));
        res.append(pre);
        return res.toString();
    }
}
//Your code took 4 milliseconds — faster than 82.68% in Java
