// Given a singly linked list node, return its length. The linked list has fields next and val.

// Constraints

// n ≤ 100,000 where n is the number of nodes in node
// Example 1
// Input
// Visualize
// node =
// 5

// 4

// 3

// Output
// 3
// Explanation
// This linked list has 3 nodes.

// Example 2
// Input
// Visualize
// node =
// 1

// 2

// Output
// 2
// Explanation
// This linked list has 2 nodes.

import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        if(node==null)
            return 0;
        int count=1;
        // node=node.next;
        while(node.next!=null&&node.next.next!=null){
            count++;
            node=node.next.next;
        }
        if(node.next==null)
            return count*2-1;
        return count*2;
    }
}
