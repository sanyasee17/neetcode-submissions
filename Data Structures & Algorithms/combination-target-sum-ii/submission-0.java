class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(candidates, 0, current, target);
        return result;
    }

    private void helper(int[] candidates, int index, List<Integer> current, int target) {

        /* Base Case */
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0 || index == candidates.length) {
            return;
        }

        /* Include the number */
        current.add(candidates[index]);
        helper(candidates, index + 1, current, target - candidates[index]);
        current.remove(current.size() - 1);

        /* Not include the number and also skip duplicates */
        for(int i = index + 1; i < candidates.length; i++) {
            if(candidates[i] != candidates[index]) {
                helper(candidates, i, current, target);
                break;
            }
        }
    }
}
