class Solution {

    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        result = new ArrayList<>();
        helper(nums, 0, 0, new ArrayList<Integer>(), target);
        return result;
    }

    public void helper(int[] nums, int currentIndex, int currentSum, List<Integer> current, int target) {

        if(currentSum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        if(currentSum > target || currentIndex == nums.length) {
            return;
        }

        current.add(nums[currentIndex]);
        helper(nums, currentIndex, currentSum + nums[currentIndex], current, target);

        current.remove(current.size() - 1);
        helper(nums, currentIndex + 1, currentSum, current, target);

    }
}
