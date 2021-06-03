package main

func largestRectangleArea(heights []int) int {
	max := 0

	length := len(heights)
	for i := 0; i < length; i++ {
		left, right := i, i

		if heights[i]*length > max {
			for left >= 0 && heights[left] >= heights[i] {
				left--
			}
			for right < length && heights[right] >= heights[i] {
				right++
			}

			if tmp := heights[i] * (right - left - 1); tmp > max {
				max = tmp
			}
		}
	}

	return max
}
