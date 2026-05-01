class Solution {

    /* Optimise - Using Two Pointer */
    public int removeDuplicates(int[] nums) {
        /* Pointer to track unique element position */
        int unique = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != nums[unique]) {
                unique++;
                nums[unique] = nums[i];
            }
        }

        return unique + 1;
    }
}