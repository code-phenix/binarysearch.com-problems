// Given a positive integer n, sum all of its digits to get a new number. Repeat this operation until the new number is less than 10 and return it.

// Constraints

// 1 ≤ n < 2 ** 31
// Example 1
// Input
// n = 8835
// Output
// 6
// Explanation
// 8 + 8 + 3 + 5 = 24
// 2 + 4 = 6

//!st My approach

class Solution {
    public int solve(int n) {
        int sum=n;
        while(n>=10){
            int temp=n;
            sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            n=sum;
        }
        return sum;
        
    }
}

//Your code took 1 millisecond — faster than 100.00% in Java

//Math approach 

class Solution {
    public int solve(int n) {
        if(n<10)
            return n;
        if(n%9==0)
            return 9;
        return n%9;
    }
}
//Your code took 1 millisecond — faster than 100.00% in Java
