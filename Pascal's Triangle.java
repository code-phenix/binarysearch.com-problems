// Given an integer n, return the nth (0-indexed) row of Pascal's triangle.

// Pascal's triangle can be created as follows: In the top row, there is an array of 1. Each subsequent row is created by adding the number above and to the left with the number above and to the right, treating empty elements as 0.


// Example 1
// Input
// n = 3
// Output
// [1, 3, 3, 1]
// Explanation
// This is row 3 in

// [1]
// [1, 1]
// [1, 2, 1]
// [1, 3, 3, 1]


import java.util.*;

class Solution {
    public int[] solve(int n) {
        if(n==0)
            return new int[]{1};
        if(n==1)
            return new int[]{1,1};
        int pre[];
        pre=new int[]{1,1};
        int count=1,temp=0;
        int cur[];
        cur=new int[]{};
        while(count<n){
            int preLen=pre.length;
            temp=1;
            cur=new int[preLen+1];
            cur[0]=1;
            for(int iterI=1;iterI<preLen;iterI++){
                cur[temp]=pre[iterI-1]+pre[iterI];
                temp++;
            }
            cur[preLen]=1;
            pre=cur;
            count++;
        }
        return cur;
    }
}

//Your code took 1 millisecond — faster than 100.00% in Java
