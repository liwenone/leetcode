package main

/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Neighbors []*Node
 * }
 */

// type Node struct {
// 	Val       int
// 	Neighbors []*Node
// }

func cloneGraph(node *Node) *Node {
	visited := make(map[*Node]*Node)

	return clone(node, visited)
}

func clone(node *Node, visited map[*Node]*Node) *Node {
	if node == nil {
		return nil
	}

	if v, ok := visited[node]; ok {
		return v
	}

	newNode := &Node{
		Val:       node.Val,
		Neighbors: make([]*Node, len(node.Neighbors)),
	}

	visited[node] = newNode
	for i := 0; i < len(node.Neighbors); i++ {
		newNode.Neighbors[i] = clone(node.Neighbors[i], visited)
	}

	return newNode
}
