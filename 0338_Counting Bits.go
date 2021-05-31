package main

func countBits(n int) []int {
	result := make([]int, n+1)

	for i := 0; i <= n; i++ {
		counter, num := 0, i
		for num != 0 {
			num = num & (num - 1)
			counter++
		}
		result[i] = counter
	}

	return result
}
