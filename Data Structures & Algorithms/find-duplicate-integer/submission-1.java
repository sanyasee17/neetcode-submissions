class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;

        /* Cyclic Sort */
        int i = 0;
        while(i < n) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                /* Put it at it's correct index */
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for(i = 0; i < n; i++) {
            int correctIndex = nums[i] - 1;
            if(i != correctIndex) {
                return nums[i];
            }
        }
        return -1;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
