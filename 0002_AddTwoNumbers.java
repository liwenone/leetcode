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
    ListNode result = new ListNode(0);
    ListNode curr = result;

    int c = 0, r = 0;
    while(l1 != null || l2 != null || c != 0) {
      int n1 = l1 == null ? 0 : l1.val;
      int n2 = l2 == null ? 0 : l2.val;
      int sum = n1 + n2 + c;

      r = sum % 10;
      c = sum > 9 ? 1 : 0;

      curr.next = new ListNode(r);
      curr = curr.next;

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
    }

    return result.next;
  }
}