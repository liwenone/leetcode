package main

func reverseString(s []byte) {
	length := len(s)
	for i := 0; i < length/2; i++ {
		s[i] = s[length-i-1] ^ s[i]
		s[i] = s[length-i-1] ^ s[i]
		s[length-i-1] = s[length-i-1] ^ s[i]
	}
}

// func reverseString(s []byte) {
// 	res := make([]byte, 0)
// 	reverse(s, 0, &res)

// 	for i := 0; i < len(s); i++ {
// 		s[i] = res[i]
// 	}
// }

// func reverse(s []byte, i int, res *[]byte) {
// 	if i == len(s) {
// 		return
// 	}

// 	reverse(s, i+1, res)
// 	*res = append(*res, s[i])
// }
