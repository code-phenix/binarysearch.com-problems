// Given a single linked list node, representing a binary number with most significant digits first, return it as an integer.

// Constraints

// n ≤ 30 where n the number of nodes in node
// Example 1
// Input
// Visualize
// node =
// 1

// 0

// 0

// Output
// 4
// Explanation
// The linked list represented 100 in binary.

import java.util.ArrayList;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(node!=null){
            arr.add(node.val);
            node=node.next;
        }
        int count=1;
        int res=arr.get(arr.size()-1)==1?1:0;
        for(int iter=arr.size()-2;iter>=0;iter--){
                count*=2;
                res+=arr.get(iter)==1?count:0;
        }
        return res;
        
    }
  //Your code took 2 milliseconds — faster than 67.56% in Java
