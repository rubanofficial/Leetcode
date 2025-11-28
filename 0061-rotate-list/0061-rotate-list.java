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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        int len = 0;
        while(fast != null){
            fast = fast.next;
            len++;
        }
        fast = head;
        k = k%len;
        if(k == 0){
            return head;
        }
        for(int i=1;i<k;i++){
            fast = fast.next;
        }
        while(fast.next!= null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;

        }
        fast.next = head;
        prev.next = null;
        return slow;
    }
}