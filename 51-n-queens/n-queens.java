class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];
        for (char[] chars : board) {
            Arrays.fill(chars, '.');
        }

        nQueens(0, board, ans);

        return ans;
    }

    private void nQueens (int row, char[][] board, List<List<String>> ans) {
        if (row == board.length) {
            List<String> list = new ArrayList<>();

            for (char[] chs : board) list.add(new String(chs));

            ans.add(list);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(row + 1, board, ans);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe (char[][] board, int row, int col) {
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