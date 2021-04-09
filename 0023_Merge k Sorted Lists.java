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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode result = head;

        boolean go = true;
        int min = 10000;
        int pos = 0;
        
        while (go) {
            go = false;
            min = 10000;
            pos = 0;

            for (int i = 0; i < lists.length; i++) {
                ListNode curr = lists[i];
                if (curr != null && curr.val < min) {
                    min = curr.val;
                    pos = i;
                }
                if (curr != null) go = true;
            }

            if (go) {
                head.next = lists[pos];
                head = head.next;
                lists[pos] = lists[pos].next;
            }
        }

        return result.next;
    }
}