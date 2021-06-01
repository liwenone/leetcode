package main

import (
	"strconv"
)

type Stack struct {
	values []int
}

func (this *Stack) Pop() int {
	size := len(this.values)
	top := this.Top()
	this.values = this.values[:size-1]

	return top
}

func (this *Stack) Push(value int) {
	this.values = append(this.values, value)
}

func (this *Stack) Top() int {
	size := len(this.values)
	return this.values[size-1]
}

func (this *Stack) Size() int {
	return len(this.values)
}

func evalRPN(tokens []string) int {
	stack := Stack{}

	for i := 0; i < len(tokens); i++ {
		token := tokens[i]

		if token == "+" || token == "-" || token == "/" || token == "*" {
			val1 := stack.Pop()
			val2 := stack.Pop()

			if token == "+" {
				stack.Push(val2 + val1)
			} else if token == "-" {
				stack.Push(val2 - val1)
			} else if token == "/" {
				stack.Push(val2 / val1)
			} else if token == "*" {
				stack.Push(val2 * val1)
			}
		} else {
			num, _ := strconv.Atoi(token)
			stack.Push(num)
		}
	}

	return stack.Top()
}
