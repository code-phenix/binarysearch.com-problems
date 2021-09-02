// Given a positive integer num, return the sum of its digits.

// Bonus: Can you do it without using strings?

// Constraints

// 0 ≤ num < 2 ** 31
// Example 1
// Input
// num = 123
// Output
// 6
// Explanation
// Since 6 = 1 + 2 + 3

// Example 2
// Input
// num = 50
// Output
// 5
// Explanation
// Since 5 = 5 + 0


class Solution {
    public int solve(int num) {
    int res=0;
    while(num>0)        {
        res+=num%10;
        num/=10;
    }
    return res;
    }
}

//Your code took 5 milliseconds — faster than 63.62% in Java
