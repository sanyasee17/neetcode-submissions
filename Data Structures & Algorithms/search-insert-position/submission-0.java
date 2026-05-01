class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] >= target) {
                // This is a potential answer
                ans = mid;

                // we can check further on the left 
                // to get the more closer >= value for target

                right = mid - 1;

            } else {
                // As we are looking for equal or more, we will right
                left = mid + 1;
            }
        }
        return ans == -1 ? nums.length : ans;
        
    }
}