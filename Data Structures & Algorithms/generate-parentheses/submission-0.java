class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backTrack(0, 0, n, res, stack);
        return res;
        
    }

    private void backTrack(int openN, int closedN, int n, List<String> res, StringBuilder current) {


        // Only add '(' if open < n
        // Only add a ')' if cloced < open
        // Valid answer, if open == closed == n

        if(openN == closedN && openN == n) {
            res.add(current.toString());
            return;
        }

        if(openN < n) {
            current.append('(');
            backTrack(openN + 1, closedN, n, res, current);
            current.deleteCharAt(current.length() - 1);
        }

        if(closedN < openN) {
            current.append(')');
            backTrack(openN, closedN + 1, n, res, current);
            current.deleteCharAt(current.length() - 1);
        }

    }
}
