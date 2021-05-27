package main

const MAX_INT = int(^uint32(0) >> 1)
const MIN_INT = ^MAX_INT

func myAtoi(s string) int {
	sum, flag := 0, 1

	length := len(s)
	startIndex := length

	for i := 0; i < length; i++ {
		n := s[i] - '0'
		if n >= 0 && n <= 9 {
			startIndex = i
			break
		}
		if s[i] == '+' || s[i] == '-' {
			startIndex = i + 1
			if s[i] == '-' {
				flag = -1
			}
			break
		}
		if s[i] != ' ' {
			break
		}
	}

	for i := startIndex; i < length; i++ {
		n := s[i] - '0'
		if n >= 0 && n <= 9 {
			if sum < MIN_INT/10 || sum == MIN_INT/10 && n > 8 {
				sum = MIN_INT
				break
			}
			if sum > MAX_INT/10 || sum == MAX_INT/10 && n > 7 {
				sum = MAX_INT
				break
			}
			sum = sum*10 + int(n)*flag
		} else {
			break
		}
	}

	return sum
}
