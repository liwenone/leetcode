package main

func lengthOfLongestSubstring(s string) int {
	start, max := 0, 0

	for i := 0; i < len(s); i++ {
		for j := start; j < i; j++ {
			if s[i] == s[j] {
				start = j + 1
				break
			}
		}

		if i-start+1 > max {
			max = i - start + 1
		}
	}

	return max
}
