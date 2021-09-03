// Given the head of a singly linked list head, return whether the values of the nodes are sorted in a strictly increasing order.

// Constraints

// 1 ≤ n ≤ 100,000 where n is the number of nodes in head
// Example 1
// Input
// Visualize
// head =
// 1

// 5

// 9

// 9

// Output
// false
// Explanation
// Even though this list is sorted, it's not strictly increasing since 9 is repeated.

// Example 2
// Input
// Visualize
// head =
// 1

// 5

// 8

// 9

// Output
// true
// Explanation
// The values 1, 5, 8, 9 are strictly increasing.

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public boolean solve(LLNode head) {
        int pre=head.val;
        head=head.next;
        while(head!=null){
            if(pre>=head.val){
                return false;
            }
            pre=head.val;
            head=head.next;
            
        }
        return true;
        
    }
}
//Your code took 95 milliseconds — faster than 98.02% in Java
