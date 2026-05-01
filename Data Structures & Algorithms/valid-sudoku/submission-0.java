class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {

                /* Skip if empty cell */
                if(board[row][col] == '.') continue;

                String squareKey = (row / 3) + ":" + (col / 3);

                if(
                    /* This is give the Set for current row, if set not exists lamba function will create one */
                    rows.computeIfAbsent(row, x -> new HashSet<>())
                            /* Now we will check if the element exists in this row set or not */
                            .contains(board[row][col])

                    || 

                    /* Cols Check */
                    cols.computeIfAbsent(col, x -> new HashSet<>())
                            .contains(board[row][col])

                    || 

                    /* Squares Check */
                    squares.computeIfAbsent(squareKey, x -> new HashSet<>())
                            .contains(board[row][col])
                    
                ) {
                    return false;
                }

                /* Lets add the values to all the sets */
                rows.get(row).add(board[row][col]);
                cols.get(col).add(board[row][col]);
                squares.get(squareKey).add(board[row][col]);
            }
        }

        return true;
    }
}
