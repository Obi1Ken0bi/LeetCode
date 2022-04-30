public class Solution {
    int m = 0;
    int n = 0;
    private char[][] grid;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        n = grid.length;
        m = grid[0].length;
        int islandCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    paintAndSearch(i, j);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private void paintAndSearch(int i, int j) {
        if (i < 0 || j < 0 || i > n - 1 || j > m - 1 || grid[i][j] == '0') return;
        grid[i][j] = '0';
        paintAndSearch(i + 1, j);
        paintAndSearch(i - 1, j);
        paintAndSearch(i, j + 1);
        paintAndSearch(i, j - 1);
    }

}
