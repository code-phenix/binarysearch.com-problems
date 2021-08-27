// Given an integer n, return whether it is equal to the sum of its own digits raised to the power of the number of digits.

// Example 1
// Input
// n = 153
// Output
// true
// Explanation
// 153 = 1 ** 3 + 5 ** 3 + 3 ** 3

class Solution {
    public boolean solve(int n) {
       int power=(int)Math.log10(n)+1,result=0;
       for(int iter=n;iter>0;iter=iter/10){
           result+=Math.pow(iter%10,power);
       }
       return result==n;
}
}

// Your code took 2 milliseconds — faster than 96.31% in Java
