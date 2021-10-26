// Given a list of integers prices representing prices of cars for sale, and a budget k, return the maximum number of cars you can buy.

// Constraints

// n ≤ 200,000 where n is the length of prices
// Example 1
// Input
// prices = [90, 30, 20, 40, 90]
// k = 95
// Output
// 3
// Explanation
// We can buy the cars with prices 30, 20, and 40.

// Example 2
// Input
// prices = [60, 90, 55, 75]
// k = 50
// Output
// 0
// Explanation
// We cannot afford any of these cars.


import java.util.*;
class Solution {
    public int solve(int[] prices, int k) {
        int len=prices.length;
        Arrays.sort(prices);
        int res=0;
        for(int iterI=0;iterI<len;iterI++){
                if(k>=prices[iterI]){
                    res++;
                    k-=prices[iterI];
                }
                if(k<=0)
                    break;
        }
        return res;
    }
}
//Your code took 49 milliseconds — faster than 88.59% in Java
