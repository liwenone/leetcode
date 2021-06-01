package main

type MinStack struct {
	values []int
	mins   []int
}

/** initialize your data structure here. */
func Constructor() MinStack {
	return MinStack{}
}

func (this *MinStack) Push(val int) {
	this.values = append(this.values, val)

	minSize := len(this.mins)
	if minSize == 0 {
		this.mins = append(this.mins, val)
	} else {
		top := this.mins[minSize-1]
		if val <= top {
			this.mins = append(this.mins, val)
		}
	}
}

func (this *MinStack) Pop() {
	size := len(this.values)
	minSize := len(this.mins)

	top := this.values[size-1]
	min := this.mins[minSize-1]
	if min == top {
		this.mins = this.mins[:minSize-1]
	}

	this.values = this.values[:size-1]
}

func (this *MinStack) Top() int {
	size := len(this.values)
	return this.values[size-1]
}

func (this *MinStack) GetMin() int {
	minSize := len(this.mins)
	return this.mins[minSize-1]
}

/**
 * Your MinStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(val);
 * obj.Pop();
 * param_3 := obj.Top();
 * param_4 := obj.GetMin();
 */
