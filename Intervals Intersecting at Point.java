// You are given a two-dimensional list of integers intervals and an integer point. Each element contains [start, end] represents an inclusive interval.

// Return the number of intervals that are intersecting at point.

// Constraints

// n ≤ 100,000 where n is the length of intervals
// Example 1
// Input
// intervals = [
//     [1, 5],
//     [3, 9],
//     [4, 8],
//     [10, 13]
// ]
// point = 4
// Output
// 3
// Explanation
// At time 4, there are 3 intervals that are intersecting: [1, 5], [3, 9], [4, 8]

class Solution {
    public int solve(int[][] intervals, int point) {
        int count=0;
        int size=intervals.length;
        for(int i=0;i<size;i++){
            if(intervals[i][0]<=point&&intervals[i][1]>=point)
                count++;
        }
        return count;
    }
}
