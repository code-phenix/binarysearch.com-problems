// Given a non-negative integer num, return whether it is a palindrome.

// Bonus: Can you solve it without using strings?

// Constraints

// num < 2 ** 31
// Example 1
// Input
// num = 121
// Output
// true
// Example 2
// Input
// num = 20200202
// Output
// true
// Example 3
// Input
// num = 43
// Output
// false

class Solution {
    public boolean solve(int num) {
        int rev=0,temp=num;
        while(temp>0){
            rev*=10;
            rev+=temp%10;
            temp/=10;
        }
        if(num==rev)
            return true;
        return false;
    }
}
//Your code took 6 milliseconds — faster than 95.85% in Java
