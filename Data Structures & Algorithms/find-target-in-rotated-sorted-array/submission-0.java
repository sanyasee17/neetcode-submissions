class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            } else {

                // We have to find the sorted part
                if(nums[left] <= nums[mid]) {
                    //Left side is sort
                    if(nums[left] <= target && target <= nums[mid]) {
                        // Number is present in the left side, Skip right side
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    // Right part is sorted, now check the same condition
                    if(nums[mid] <= target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

            }

        }
        return -1; // Not Found!
        
    }
}
