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
    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        //ListNode node = new ListNode();
       ListNode curr = head;
        ListNode prev = head.next;
​
        while(prev != null){
            int temp = prev.val;
            prev.val = curr.val;
            curr.val = temp;
            if(prev.next != null){
                curr=prev.next;
                prev = curr.next;
            }
          else{
              prev = prev.next;
          }
      
        }
              return head;
    }
}
