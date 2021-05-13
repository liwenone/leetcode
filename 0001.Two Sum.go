func towSum(nums []int, target int) []int {
    result := make([]int, 2)
    tmpMap := make(map[int][int])

    length := len(nums)
    for i := 0; i < length; i++ {
        value, exist = tmpMap[target - nums[i]]
        if exist {
            result[0] = value
            result[1] = i
            break
        } else {
            tmpMap[nums[i]] = i
        }
    }

    return result
}