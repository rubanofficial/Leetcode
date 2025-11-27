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
    public static ListNode rev(ListNode st,ListNode end){
        ListNode prev = null;
        ListNode curr = st;
        ListNode temp = null;
        while(curr != end){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
        ListNode curr = head;
        ListNode st = null;
        ListNode stprev = null;
        ListNode end = null;
        ListNode endprev =null;
        if (left == 1) {
            stprev = null;
            st = head;
        }
        for(int i=1;i<=right;i++){
            if (i == left - 1 && left != 1){
                stprev = curr;
                st = curr.next;
            }
            if(i == right){
                end = curr;
                endprev = curr.next;
                break;
            }
            curr = curr.next;
        }
        ListNode newhead = rev(st,endprev);
        if(stprev != null){
            stprev.next = newhead;
        }
        else{
            head = newhead;
        }
        
        st.next = endprev;
        return head;
    }
}