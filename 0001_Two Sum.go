package main

func twoSum(nums []int, target int) []int {
	ans := make([]int, 2)
	tmp := make(map[int]int)

	for i := 0; i < len(nums); i++ {
		index, exist := tmp[target-nums[i]]
		if exist {
			ans[0] = index
			ans[1] = i
			break
		} else {
			tmp[nums[i]] = i
		}
	}

	return ans
}
