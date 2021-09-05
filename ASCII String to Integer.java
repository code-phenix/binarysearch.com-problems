// You are given a string s containing digits from "0" to "9" and lowercase alphabet characters. Return the sum of the numbers found in s.

// Constraints

// 1 ≤ n ≤ 100,000 where n is the length of s
// Example 1
// Input
// s = "11aa32bbb5"
// Output
// 48
// Explanation
// Since 11 + 32 + 5 = 48.

// Example 2
// Input
// s = "abc"
// Output
// 0
// Explanation
// There's no digits so it defaults to 0.

// Example 3
// Input
// s = "1a2b30"
// Output
// 33
// Explanation
// Since 1 + 2 + 30 = 33.

class Solution {
    public static boolean checkIfDigit(String s,int index){
        if(s.charAt(index)>='0'&&s.charAt(index)<='9')
            return true;
        return false;
    }
    public int solve(String s) {
        int res=0,cur=0;
        for(int iterI=0;iterI<s.length();iterI++){
           if(checkIfDigit(s,iterI))
                cur=cur*10 + (s.charAt(iterI)-'0');
            else{
                res+=cur;
                cur=0;
            }
        }
        res+=cur;
        return res;
    }
}

//Your code took 34 milliseconds — faster than 62.57% in Java
