// You are given a singly linked list node containing positive integers. Return the same linked list where every node's next points to the node val nodes ahead. If there's no such node, next should point to null.

// Constraints

// n ≤ 100,000 where n is the number of nodes in node
// Example 1
// Input
// Visualize
// node =
// 2

// 1

// 4

// 1

// Output
// Visualize
// 2

// 4

// Explanation
// Note that 2's next is 2 node ahead. 4's next is out of bounds, so it's set to null.

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node) {
       LLNode cur=node,tempNode=node;
       int temp=0;
       boolean flag=true;
       while(flag) {
           temp=cur.val;
           while(temp>0&&tempNode!=null){
               tempNode=tempNode.next;
               temp--;
           }
           if(tempNode!=null){
               cur.next=tempNode;
               cur=tempNode;
           }
           else{
               cur.next=null;
               flag=false;
           }
       }
       return node;
    }                                 
}

//Your code took 55 milliseconds — faster than 77.86% in Java
