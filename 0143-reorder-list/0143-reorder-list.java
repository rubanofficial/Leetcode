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
    public void reorderList(ListNode head) {
        
        Stack <ListNode> res = new Stack<>();
        ListNode temp = head;
        int l = 0;
        while(temp != null){
            res.push(temp);
            temp = temp.next;
            l++;
        }
        temp = head;
        for(int i=0;i<l/2;i++){
            ListNode nextnode = temp.next;
            temp.next = res.pop();
            temp.next.next = nextnode;
            temp = temp.next.next;
        }
        if(temp != null){
            temp.next = null;
        }
    }
}