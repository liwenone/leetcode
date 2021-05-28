package main

func strStr(haystack string, needle string) int {
	if len(needle) == 0 {
		return 0
	}

	A, B := len(haystack), len(needle)
	for i := 0; i < A-B+1; i++ {
		j := 0
		for ; j < B; j++ {
			if haystack[i+j] != needle[j] {
				break
			}
		}

		if j == B {
			return i
		}
	}

	return -1
}
