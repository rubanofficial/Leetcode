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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy.next;
        ListNode prev = dummy;
        int n=0;
        int i = 0;
        while(temp != null){
            n = temp.val;
            while(temp.next!=null && n == temp.next.val ){
                i = 1;
                temp.next = temp.next.next;
            }
            if(i == 1){
                prev.next = temp.next;
                i = 0;
            }
            else{
                prev = prev.next;
            }
            temp = temp.next;
        }
        return dummy.next;
     }
}