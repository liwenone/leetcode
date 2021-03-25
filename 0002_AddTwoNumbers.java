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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0, null);
    ListNode curr = result;

    int c = 0, r = 0;
    while(l1 != null || l2 != null || c != 0) {
      int n1 = l1 == null ? 0 : l1.val;
      int n2 = l2 == null ? 0 : l2.val;

      r = (n1 + n2 + c) % 10;
      c = (n1 + n2 + c) / 10;

      curr.next = new ListNode(r);

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
      curr = curr.next;
    }

    return result.next;
  }
}