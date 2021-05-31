package main

func singleNumber(nums []int) int {
	var ans int
	for i := 0; i < len(nums); i++ {
		ans = ans ^ nums[i]
	}

	return ans
}
