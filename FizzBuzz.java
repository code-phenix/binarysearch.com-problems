// Given an integer n, return a list of integers from 1 to n as strings except for multiples of 3 use “Fizz” instead of the integer and for the multiples of 5 use “Buzz”. For integers which are multiples of both 3 and 5 use “FizzBuzz”.

// Constraints

// 0 ≤ n ≤ 100,000
// Example 1
// Input
// n = 15
// Output
// ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

import java.util.*;

class Solution {
    public String[] solve(int n) {
        String[] res=new String[n];
        for(int i=0;i<n;i++){
            if((i+1)%3==0&&(i+1)%5==0)
                res[i]="FizzBuzz";
            else if((i+1)%3==0)
                res[i]="Fizz";
            else if((i+1)%5==0)
                res[i]="Buzz";
            else 
                res[i]=String.valueOf(i+1);
        }
        return res;
        
    }
}

//Your code took 31 milliseconds — faster than 65.45% in Java
