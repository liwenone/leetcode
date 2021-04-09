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
    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while (l1 != null & l2 != null) {
            if (l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        if (l1 != null) dummy.next = l1;
        if (l2 != null) dummy.next = l2;

        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;

        for (int i = 0; i < lists.length; i++) {
            result = mergeList(result, lists[i]);
        }

        return result;
    }
}