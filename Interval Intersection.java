// Given a two-dimensional integer list intervals of the form [start, end] representing intervals (inclusive), return their intersection, that is, the interval that lies within all of the given intervals.

// You can assume that the intersection will be non-empty.

// Constraints

// 1 ≤ n ≤ 100,000 where n is the length of intervals
// Example 1
// Input
// intervals = [
//     [1, 100],
//     [10, 50],
//     [15, 65]
// ]
// Output
// [15, 50]
// Explanation
// Consider the ranges [1, 100], [10, 50], [15, 65] on a line. The range [15, 50] is the only interval that is included by all of them.


class Solution {
    public int[] solve(int[][] intervals) {
        // int firstMax=intervel[0][0],secondMin=intervel[0][1];
        int res[]=new int[2];
        res[0]=intervals[0][0];
        res[1]=intervals[0][1];
        int row=intervals.length,col=intervals[0].length;
        for(int iterI=0;iterI<row;iterI++){
                if(intervals[iterI][0]>res[0]){
                    res[0]=intervals[iterI][0];
                }
                if(intervals[iterI][1]<res[1]){
                    res[1]=intervals[iterI][1];
                }
        }
        return res;


        
    }
}
//Your code took 39 milliseconds — faster than 99.74% in Java
