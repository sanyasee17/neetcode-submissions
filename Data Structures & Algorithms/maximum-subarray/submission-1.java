class Solution {

    /* Kadane's Algorithm - Add, Max Check, Reset if Zero */
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int curSum = 0;

        for(int num : nums) {

            /* Add */
            curSum = curSum + num;

            /* Max Check */
            maxSum = Math.max(maxSum, curSum);

            /* Reset if negative */
            if(curSum < 0) {
                curSum = 0;
            }
        }

        return maxSum;
    }
}
