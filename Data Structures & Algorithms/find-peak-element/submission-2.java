class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;
        /* Edge Case */
        if(n == 1) {
            return 0;
        }
        
        if (nums[0] > nums[1]) {
            return 0;
        }

        if(nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }


        int left = 1;
        int right = nums.length - 2;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            /* Left side is bigger */
            else if(nums[mid - 1] > nums[mid]) {
                right = mid - 1;
            }
            /* Right side is bigger */
            else {
                left = mid  + 1;
            }
        }
        return -1;
    }
}