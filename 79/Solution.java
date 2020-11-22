public class Solution {

    public final int[][] DIRECTIONS = new int[][]{
        {1, 0}, {0, 1}, {-1, 0}, {0, -1}
    };

    public boolean exist(char[][] board, String word) {

        boolean[][] memo = new boolean[board.length][board[0].length];

        for(int i=0; i < board.length; i++) for(int j=0; j < board[0].length; j++)
            if(DFS(board, memo, i, j, word, 0)) return true;

        return false;
    }

    public boolean DFS(char[][] board, boolean[][] memo, int x, int y, String word, int index) {

        if(index == word.length()) return true;
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || memo[x][y] || board[x][y] != word.charAt(index)) return false;

        memo[x][y] = true;
        for(int[] dir: DIRECTIONS) if(DFS(board, searched, x + dir[0], y + dir[1], word, index + 1)) return true;
        memo[x][y] = false;

        return false;
    }

}
