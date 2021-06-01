package main

func isPowerOfFour(n int) bool {
	if n <= 0 {
		return false
	}

	base := 1
	for base <= n {
		if n == base {
			return true
		}
		base = base << 2
	}

	return false
}
