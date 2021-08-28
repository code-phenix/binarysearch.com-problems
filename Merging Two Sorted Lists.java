// Given two lists of integers a and b sorted in ascending order, merge them into one large sorted list.

// Constraints

// 0 ≤ n ≤ 200,000 where n is the length of a
// 0 ≤ m ≤ 200,000 where m is the length of b
// Example 1
// Input
// a = [5, 10, 15]
// b = [3, 8, 9]
// Output
// [3, 5, 8, 9, 10, 15]

class Solution {
    public int[] solve(int[] a, int[] b) {
        int size=a.length+b.length;
        int sizeA=a.length,sizeB=b.length;
        int res[]=new int[size];
        int startPointerA=0,startPointerB=0;
        for(int iter=0;iter<size;iter++){
            if(startPointerA<sizeA&&startPointerB<sizeB){
            if( a[startPointerA]<b[startPointerB]){
                res[iter]=a[startPointerA];
                startPointerA++;
            }
            else{
                res[iter]=b[startPointerB];
                startPointerB++;
            }
            }
            else{
                if(startPointerA>=sizeA){
                    res[iter]=b[startPointerB];
                    startPointerB++;
                    }
                else{
                    res[iter]=a[startPointerA];
                    startPointerA++;
                }
            }
        }
        return res;
        
    }
}
//or Use merge sort 
//Your code took 124 milliseconds — faster than 38.61% in Java
