package main

func reverseBits(num uint32) uint32 {
	var ans uint32
	for i := 0; i < 32; i++ {
		a := num >> i & 1
		ans = ans | (a << (31 - i))
	}

	return ans
}
