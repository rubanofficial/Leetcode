/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupTail = dummy;
        while(true){
            ListNode kth = prevGroupTail;
            for(int i=0;i<k;i++){
                kth = kth.next;
                if(kth == null){
                    return dummy.next;
                }
            }
            ListNode nextGroupHead = kth.next;
            ListNode curr = prevGroupTail.next;
            ListNode prev = nextGroupHead;
            while(curr != nextGroupHead){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                
            }
            ListNode newGroupHead = kth;
            ListNode newGroupTail = prevGroupTail.next;
            prevGroupTail.next = newGroupHead;
            prevGroupTail = newGroupTail;
        }
    }
}