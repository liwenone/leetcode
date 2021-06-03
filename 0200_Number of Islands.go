package main

func numIslands(grid [][]byte) int {
	counter := 0
	for r := 0; r < len(grid); r++ {
		for c := 0; c < len(grid[r]); c++ {
			if grid[r][c] == '1' {
				counter++
				dfs(grid, r, c)
			}
		}
	}

	return counter
}

func dfs(grid [][]byte, r int, c int) {
	if r < 0 || c < 0 || r >= len(grid) || c >= len(grid[r]) || grid[r][c] == '0' {
		return
	}

	grid[r][c] = '0'

	dfs(grid, r-1, c)
	dfs(grid, r+1, c)
	dfs(grid, r, c-1)
	dfs(grid, r, c+1)
}
