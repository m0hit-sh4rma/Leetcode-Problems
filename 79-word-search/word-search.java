class Solution {
    public boolean exist(char[][] board, String word) {
        boolean found = false;
        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    if (search(1, board, word, i, j, visited)) return true;
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }
    private boolean search (int index, char[][] board, String word, int row, int col, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }

        if (row - 1 >= 0) {
            if (!visited[row - 1][col] && board[row - 1][col] == word.charAt(index)) {
                visited[row - 1][col] = true;
                if (search(index + 1, board, word, row - 1, col, visited)) return true;
                visited[row - 1][col] = false;
            }
        }
        if (row + 1 < board.length) {
            if (!visited[row + 1][col] && board[row + 1][col] == word.charAt(index)) {
                visited[row + 1][col] = true;
                if (search(index + 1, board, word, row + 1, col, visited)) return true;
                visited[row + 1][col] = false;
            }
        }
        if (col - 1 >= 0) {
            if (!visited[row][col - 1] && board[row][col - 1] == word.charAt(index)) {
                visited[row][col - 1] = true;
                if (search(index + 1, board, word, row, col - 1, visited)) return true;
                visited[row][col - 1] = false;
            }
        }
        if (col + 1 < board[0].length) {
            if (!visited[row][col + 1] && board[row][col + 1] == word.charAt(index)) {
                visited[row][col + 1] = true;
                if (search(index + 1, board, word, row, col + 1, visited)) return true;
                visited[row][col + 1] = false;
            }
        }
        return false;
    }
}