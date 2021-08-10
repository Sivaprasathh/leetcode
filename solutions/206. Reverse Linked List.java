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
    public ListNode reverseList(ListNode head) {
          if(head==null) return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = curr.next;
           
        while(curr != null){
            curr.next = prev;
           prev = curr;
             curr = temp;
            if(temp != null)
                temp = temp.next;
            
        }
        return prev;
    }
}
