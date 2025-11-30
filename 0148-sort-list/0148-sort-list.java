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
    public ListNode sortList(ListNode head) {
        ListNode curr = head;
        int l = 0;
        while(curr != null){
            l++;
            curr = curr.next;
        }
        int [] arr = new int [l];
        curr = head;
        int i=0;
        while(curr != null){
            arr[i] = curr.val;
            curr = curr.next;
            i++;
        }
        Arrays.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        curr = head;
        i=0;
        while(i < l){
            ListNode node = new ListNode(arr[i]);
            tail.next = node;
            tail = tail.next;
            i++;
        }
        tail.next = null;
        return dummy.next;
    }
}