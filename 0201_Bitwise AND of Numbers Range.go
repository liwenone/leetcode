package main

func rangeBitwiseAnd(left int, right int) int {
	counter := 0

	for left != right {
		left, right = left>>1, right>>1
		counter++
	}

	return left << counter
}
