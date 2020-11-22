public class Solution {

    public final int[][] DIRECTIONS = new int[][]{
        {1, 0}, {0, 1}, {-1, 0}, {0, -1}
    };

    public boolean exist(char[][] board, String word) {
        for(int i=0; i < board.length; i++) for(int j=0; j < board[0].length; j++) if(DFS(board, new boolean[board.length][board[0].length], i, j, word)) return true;
        return false;
    }

    public boolean DFS(char[][] board, boolean[][] searched, int x, int y, String remaining) {

        if(remaining.length() == 0) return true;
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || searched[x][y] || board[x][y] != remaining.charAt(0)) return false;

        searched[x][y] = true;
        for(int[] dir: DIRECTIONS) if(DFS(board, searched, x + dir[0], y + dir[1], remaining.substring(1, remaining.length()))) return true;
        searched[x][y] = false;

        return false;
    }

}
