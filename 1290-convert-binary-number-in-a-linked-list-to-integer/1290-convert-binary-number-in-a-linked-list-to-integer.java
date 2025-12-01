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
    public int getDecimalValue(ListNode head) {
        if(head.next == null && head.val == 0){
            return 0;
        }
        ListNode curr = head;
        int len = 0;
        int sum = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        System.out.println(len);
        curr = head;
        while(curr != null){
            int v = curr.val;
            int p = (int)Math.pow(2, len - 1);
            if(v == 1){
                sum = sum + p;
            }
            len = len-1;
            curr = curr.next;
        }
        return sum;
    }
}