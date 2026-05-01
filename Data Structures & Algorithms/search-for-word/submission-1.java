class Solution {

    private int n, m;

    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        /* Finf the starting char to search */
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(searchWord(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean searchWord(char[][] board, String word, int row, int col, int currentIndex) {
        
        /* Base Case */
        if(currentIndex == word.length()) {
            return true;
        }

        /* Out of Bound or Char is not matching - skip */
        if(row < 0 || col < 0 || row >= n || col >= m
            || board[row][col] != word.charAt(currentIndex)) {
            return false;
        }
        
        /* Save the character to revert at postion after exploration */
        char currentChar = board[row][col];

        /* Mark current position as visited */
        board[row][col] = ' ';

        boolean ans = searchWord(board, word, row - 1, col, currentIndex + 1) // Top
                    || searchWord(board, word, row + 1, col, currentIndex + 1) // Bottom
                    || searchWord(board, word, row, col - 1, currentIndex + 1) // Left
                    || searchWord(board, word, row, col + 1, currentIndex + 1); // Right

        /* Revert current postion with it's value */
        board[row][col] = currentChar;

        return ans;
    }
}




















