class Solution {
    List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {

        ans = new ArrayList<>();
        char[][] board = new char[n][n];

        /* Fill the board with "." */
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        /* Call helper to check boards */
        helper(0, board);
        
        return ans;
    }

    private void helper(int row , char[][] board) {

        /* Base Case */
        if(row == board.length) {
            /* Convert board to required List<String> format */
            List<String> boardCopy = new ArrayList<>();
            for(char[] chars : board) {
                boardCopy.add(new String(chars));
            }
            ans.add(boardCopy);
            return;
        }

        /* Check for each col for current row, if we can place a queen */
        for(int col = 0; col < board.length; col++) {
            if(placingIsPossible(board, row, col)) {
                board[row][col] = 'Q';
                helper(row + 1, board);
                board[row][col] = '.';
            }
        }
    }

    private boolean placingIsPossible(char[][] board, int row, int col) {

        /* Check Top */
        int r = row;
        int c = col;
        while(r >= 0) {
            if(board[r][c] == 'Q') return false;
            r--;
        }

        /* Check Top - Left Diagonal */
        r = row;
        c = col;
        while(r >= 0 && c >= 0) {
            if(board[r][c] == 'Q') return false;
            r--;
            c--;
        }

        /* Check Top - Right Diagonal */
        r = row;
        c = col;
        while(r >= 0 && c < board.length) {
            if(board[r][c] == 'Q') return false;
            r--;
            c++;
        }

        return true;
    }
}
