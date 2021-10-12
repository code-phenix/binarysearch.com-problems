// Given a number n, return a list of all prime numbers smaller than or equal to n in ascending order.

// Constraints

// n ≤ 100,000
// Example 1
// Input
// n = 3
// Output
// [2, 3]
// Example 2
// Input
// n = 10
// Output
// [2, 3, 5, 7]
// Example 3
// Input
// n = 20
// Output
// [2, 3, 5, 7, 11, 13, 17, 19]

import java.util.ArrayList;

class Solution {
    public static boolean primeThaana(int iterI,int n){
         for(int iterJ=2;iterJ<(n/2)+1;iterJ++){
                if(iterI==iterJ)
                    continue;
                if(iterI%iterJ==0){
                    return false;
                }
            }
            return true;
    }
    public static int[] solve(int n) {
        if(n==1)
            return new int[]{};
        ArrayList<Integer> arr=new ArrayList<>();
        boolean flag;
        for(int iterI=2;iterI<=n;iterI++){
            if(primeThaana(iterI,n)){
                arr.add(iterI);
            }

        }
        int size=arr.size();
        int res[]=new int[size];
        for(int iterI=0;iterI<size;iterI++){
            res[iterI]=arr.get(iterI);
        }
        return res;
    }
}
//Your code took 2 milliseconds — faster than 71.36% in Java
