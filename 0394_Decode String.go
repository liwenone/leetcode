package main

import (
	"strconv"
	"strings"
)

func decodeString(s string) string {
	numStack := make([]string, 0)
	strStack := make([]string, 0)

	num, str := "", ""
	for i := 0; i < len(s); i++ {
		char := s[i]
		if char == '[' {
			numStack = append(numStack, num)
			num = ""

			strStack = append(strStack, str)
			str = ""
		} else if char == ']' {
			num = numStack[len(numStack)-1]
			numStack = numStack[:len(numStack)-1]

			tmp := strStack[len(strStack)-1]
			strStack = strStack[:len(strStack)-1]

			counter, _ := strconv.Atoi(num)
			str = tmp + strings.Repeat(str, counter)

			num = ""

		} else if char-'0' >= 0 && char-'0' <= 9 {
			num += string(char)
		} else {
			str += string(char)
		}
	}

	return str
}
