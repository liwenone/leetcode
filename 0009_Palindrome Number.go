package main

func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}

	sum, tmp := 0, x
	for tmp != 0 {
		sum = sum*10 + tmp%10
		tmp = tmp / 10
	}

	return sum == x
}
