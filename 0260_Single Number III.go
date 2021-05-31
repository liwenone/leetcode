package main

func singleNumber(nums []int) []int {
	mix := 0
	for i := 0; i < len(nums); i++ {
		mix ^= nums[i]
	}

	result := []int{mix, mix}
	mix = mix&(mix-1) ^ mix

	for i := 0; i < len(nums); i++ {
		if nums[i]&mix == 0 {
			result[0] ^= nums[i]
		} else {
			result[1] ^= nums[i]
		}
	}

	return result
}
