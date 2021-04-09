/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode[] reverse(ListNode before, ListNode last) {
        ListNode head = before.next;
        ListNode after = last.next;

        ListNode first = head;
        ListNode second = head.next;

        while (first != last) {
            ListNode tmp = second.next;
            second.next = first;

            first = second;
            second = tmp;
        }

        before.next = first;
        head.next = after;

        return first;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode before = dummy;
        ListNode last = dummy.next;

        int counter = 0;
        while (last != null) {
            while (++counter < k && last != null) last = last.next;
            
            counter = 0;
            if (last != null) {
                ListNode bn = before.next;
                ListNode ln = last.next;
                reverse(before, last);
                last = ln;
                before = bn;
            }
        }

        return dummy.next;
    }
}