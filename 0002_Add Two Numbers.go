/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

package main

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	curr := &ListNode{}
	head := curr

	sum := 0
	for l1 != nil || l2 != nil || sum != 0 {
		if l1 != nil {
			sum += l1.Val
			l1 = l1.Next
		}
		if l2 != nil {
			sum += l2.Val
			l2 = l2.Next
		}

		curr.Next = &ListNode{
			Val: sum % 10,
		}

		curr = curr.Next

		sum /= 10
	}

	return head.Next
}
