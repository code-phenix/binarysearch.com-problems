// The factorial of a number n is defined as n! = n * (n - 1) * (n - 2) * ... * 1.

// Given a positive integer a, return n such that n! = a. If there is no integer n that is a factorial, then return -1.

// Constraints

// 0 < a < 2 ** 31
// Example 1
// Input
// a = 6
// Output
// 3
// Explanation
// 3! = 6

// Example 2
// Input
// a = 10
// Output
// -1
// Explanation
// 10 is not any integer factorial.

class Solution {
    public int solve(int a) {
        int ans=1;
        for(int iterI=1;iterI<=a;iterI++){
            ans*=iterI;
            if(ans==a)
                return iterI;
        }
        return -1;
    }
}
//Your code took 1 millisecond — faster than 99.72% in Java
