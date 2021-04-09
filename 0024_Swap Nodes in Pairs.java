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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            ListNode tmp = head.next;
            head.next = tmp.next;
            
            prev.next = tmp;
            tmp.next = head;

            prev = head;
            head = head.next;
        }

        return dummy.next;
    }
}