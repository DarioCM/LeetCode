package org.example.graph.general;

public class NumberOfIslands_200 {

    // Helper function in case we are out of bounds
    public boolean inBounds(char[][] grid, int x, int y) {
        return x >= 0 && y >= 0 && x != grid.length && y != grid[0].length;
    }

    // DFS (Depth-First Search)
    public void dfs(char[][] grid, boolean[][] visited, int x, int y) {

        // If out of bounds, don't bother
        if (!inBounds(grid, x, y)) return;

        // If it is water, don't go
        if (grid[x][y] == '0') return;

        // If visited, don't bother
        if (visited[x][y]) return;

        visited[x][y] = true;

        // Run dfs Up, Down, Left,Right
        dfs(grid, visited, x - 1, y);
        dfs(grid, visited, x + 1, y);
        dfs(grid, visited, x, y - 1);
        dfs(grid, visited, x, y + 1);
    }

    public int numIslands(char[][] grid) {
        // 1. Maybe run nested for loop and dfs each time we see
        // a 1 and it has not been visited. When we come out of the DFS, we
        // increase the count by 1
        // 2. Each DFS call will visited the entire land so we won't see it again later

        int rowSize = grid.length;
        int colSize = grid[0].length;

        boolean[][] visited = new boolean[rowSize][colSize];
        int count = 0;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                // DFS when we see a land. Visit all the parts of this land
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }


}
