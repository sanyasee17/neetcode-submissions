class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>();

        helper(0, nums, new ArrayList<>(), subsets);

        return subsets;
    }

    public void helper(int currentIndex, int[] nums, List<Integer> subset, List<List<Integer>> subsets) {
        
        // Base Condition
        if(currentIndex == nums.length) {
            // We found 1 answer
            subsets.add(new ArrayList<>(subset));
            return;
        }

        // Include the number 
        subset.add(nums[currentIndex]);
        helper(currentIndex + 1, nums, subset, subsets);

        // Not include the number
        subset.remove(subset.size() - 1);
        helper(currentIndex + 1, nums, subset, subsets);

    }
}
