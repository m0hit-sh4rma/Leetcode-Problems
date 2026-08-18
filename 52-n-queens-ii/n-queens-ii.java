class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for (char[] chars : board) {
            Arrays.fill(chars, '.');
        }

        solve(0, board);
        return count;
    }
    private void solve (int row, char[][] board) {
        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(row + 1, board);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe(char[][] board, int row, int col) {
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col] == 'Q') return false;
        }

        int r = row - 1;
        int c = col - 1;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') return false;
            r--;
            c--;
        }

        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') return false;
            r--;
            c++;
        }
        return true;
    }
}