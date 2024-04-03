package DFS.ConnectivityBlocks;

/**
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 */
public class lc200 {
    private boolean[][] flag;
    private int n,m;
    private int[] dx = new int[]{1,-1,0,0};
    private int[] dy = new int[]{0,0,1,-1};
    private char[][] grid;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        int ans = 0;
        n = grid.length;
        m = grid[0].length;
        flag = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == '1' && !flag[i][j]){
                    dfs(i,j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(int i, int j) {
        flag[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == '1' && !flag[x][y]){
                dfs(x,y);
            }
        }
    }
}
