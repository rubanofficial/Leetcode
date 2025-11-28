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
    public static ListNode rev(ListNode head){
        ListNode temp = head;
        ListNode nextnode = null;
        ListNode prev = null;
        while(temp != null){
            nextnode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextnode;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        int sum =0;
        l1 = rev(l1);
        l2 = rev(l2);
        while(l1 != null || l2 != null || carry != 0){
            int a =0;
            int b=0;
            if(l1 != null){
                a = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                b = l2.val;
                l2 = l2.next;
            }
            sum = (a+b+carry)%10;
            ListNode newnode = new ListNode(sum);
            carry = (a+b+carry)/10;
            if(head == null){
                head = newnode;
                tail = newnode;
            }
            else{
                tail.next = newnode;
                tail = tail.next;
            }
        }
        tail.next = null;
        ListNode res = rev(head);
        return res;
    }
}