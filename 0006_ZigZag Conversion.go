package main

import (
	"strings"
)

func convert(s string, numRows int) string {
	if numRows == 1 {
		return s
	}

	length := len(s)
	rows := make([][]byte, numRows)
	flag := 1
	counter := 0

	for i := 0; i < length; i++ {
		if rows[counter] == nil {
			rows[counter] = make([]byte, 0, length/numRows)
		}
		rows[counter] = append(rows[counter], s[i])

		if counter == 0 && flag == -1 {
			flag = 1
		}
		if counter == numRows-1 && flag == 1 {
			flag = -1
		}

		counter += flag
	}

	ans := make([]string, 0, length)
	for r := 0; r < numRows; r++ {
		ans = append(ans, string(rows[r]))
	}

	return strings.Join(ans, "")
}
