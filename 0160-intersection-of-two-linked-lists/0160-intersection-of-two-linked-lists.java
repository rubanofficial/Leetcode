/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet <ListNode> res = new HashSet<>();
        ListNode temp = headA;
        while(temp != null){
            res.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            if(res.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}