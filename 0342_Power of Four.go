package main

func isPowerOfFour(n int) bool {
	if n <= 0 {
		return false
	}

	for n != 1 {
		r := n % 4
		if r != 0 {
			return false
		} else {
			n = n / 4
		}
	}

	return true
}
