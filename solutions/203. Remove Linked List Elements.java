/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
  
           
​
       ListNode node = head;
        ListNode curr = null;
        while(node != null){
         if(node == head && head.val == val){
                head = node.next;
            }
        else if(node.val == val){
            curr.next = node.next;
            
        }
            else{
                curr=node;
            }
            node=node.next;
        } 
     return head;     
    }
