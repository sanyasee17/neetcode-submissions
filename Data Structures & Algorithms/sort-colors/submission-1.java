class Solution {
    public void sortColors(int[] nums) {
        /*
        This we can't do bro
        Arrays.sort(nums);
        */

        /* Case for '0' */
        int start = 0; 
        /* Case for '1' */
        int mid = 0;
        /* Case for '2' */
        int end = nums.length - 1;

        while(mid <= end) {

            if(nums[mid] == 1) {
                mid++;
            } else if(nums[mid] == 0) {
                swap(nums, mid, start);
                mid++;
                start++;
            } else {
                swap(nums, mid, end);
                end--;
            }

        }

    }

    public void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}