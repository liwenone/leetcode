package main

func check(s string, L int, R int, start *int, end *int) {
	for L >= 0 && R < len(s) && s[L] == s[R] {
		if R-L > *end-*start {
			*start = L
			*end = R
		}
		L--
		R++
	}
}

func longestPalindrome(s string) string {
	start, end := 0, 0
	for i := 0; i < len(s); i++ {
		check(s, i, i, &start, &end)
		check(s, i, i+1, &start, &end)
	}

	return s[start : end+1]
}
