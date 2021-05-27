package main

const MAX_INT = int(^uint32(0) >> 1)
const MIN_INT = ^MAX_INT

func reverse(x int) int {
	sum := 0

	for x != 0 {
		n := x % 10
		if sum < MIN_INT/10 || sum == MIN_INT/10 && -n > 8 || sum > MAX_INT/10 || sum == MAX_INT/10 && n > 7 {
			sum = 0
			break
		} else {
			sum = sum*10 + n
		}

		x /= 10
	}

	return sum
}
