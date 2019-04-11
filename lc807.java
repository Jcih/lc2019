class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int ans = 0;
        int[] maxRowHeights = new int[grid.length];
        int[] maxColHeights = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int rowMax = 0;
            int colMax =0;
            for (int j = 0; j < grid[0].length; j++) {
                rowMax = Math.max(rowMax, grid[i][j]);
                colMax = Math.max(colMax, grid[j][i]);
            }
            maxRowHeights[i] = rowMax;
            maxColHeights[i] = colMax;
        }
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int maxRaise = Math.min(maxRowHeights[i], maxColHeights[j]);
                ans += maxRaise - grid[i][j];
            }
        }
        return ans;
    }
}