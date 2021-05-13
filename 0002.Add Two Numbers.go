/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	result := &ListNode{}
	curr := result

	c := 0
	for l1 != nil || l2 != nil || c != 0 {
		value := c
		if l1 != nil {
			value += l1.Val
			l1 = l1.Next
		}
		if l2 != nil {
			value += l2.Val
			l2 = l2.Next
		}

		value, c = value%10, value/10
		curr.Next = &ListNode{Val: value}
		curr = curr.Next
	}

	return result.Next
}
