//don't understand , hard
//https://github.com/fishercoder1534/Leetcode/blob/master/src/main/java/com/fishercoder/solutions/_289.java
class Solution {
    public void gameOfLife(int[][] board) {
        int height = board.length;
            int width = board[0].length;
            int[][] next = new int[height][width];
            int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    int liveCellsCount = 0;
                    //count all its live cells

                    for (int[] dir : directions) {
                        int x = i + dir[0];
                        int y = j + dir[1];
                        if (x >= 0 && y >= 0 && x < height && y < width && board[x][y] == 1) {
                            liveCellsCount++;
                        }
                    }

                    if (board[i][j] == 1) {
                        if (liveCellsCount <= 3 && liveCellsCount >= 2) {
                            next[i][j] = 1;
                        }
                    } else if (board[i][j] == 0) {
                        if (liveCellsCount == 3) {
                            next[i][j] = 1;
                        }
                    }
                }
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j] = next[i][j];
                }
            }

    }
}