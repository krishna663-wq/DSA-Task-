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
        ListNode ta = headA;
        ListNode tb = headB;
        while(ta!=tb){
            ta=ta==null? headB:ta.next;
            tb= tb==null ? headA:tb.next;
        }
        return tb;
        
    }
}