package main

func hammingWeight(num uint32) int {
	var ans uint32

	for i := 0; i < 32; i++ {
		ans += (num >> i) & 1
	}

	return int(ans)
}
