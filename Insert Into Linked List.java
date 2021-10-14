// You are given a singly linked list head as well as integers pos and val. Insert a new node with value val before index pos of head.

// Constraints

// 1 ≤ n ≤ 100,000 where n is the number of nodes in head
// 0 ≤ pos ≤ n
// Example 1
// Input
// Visualize
// head =
// 1

// 3

// 5

// 7

// pos = 2
// val = 9
// Output
// Visualize
// 1

// 3

// 9

// …

// Example 2
// Input
// Visualize
// head =
// 1

// pos = 0
// val = 3
// Output
// Visualize
// 3

// 1

// Example 3
// Input
// Visualize
// head =
// 2

// pos = 1
// val = 5
// Output
// Visualize
// 2

// 5



/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode head, int pos, int val) {
        LLNode temp=head;
        LLNode node=new LLNode(val);
        if(pos==0){
            node.next=head;
            return node;
        }
        while(pos>1){
            temp=temp.next;
            pos--;
        }
        node.next=temp.next;
        temp.next=node;
        return head;
    }
}
// Your code took 69 milliseconds — faster than 93.28% in Java
