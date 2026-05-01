class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        /* As we want to run binary search on smaller array */
        if(n1 > n2) return findMedianSortedArrays(nums2, nums1);

        int low = 0;
        int high = n1;
        int n = n1 + n2;

        /* How many elements we need to add in left side */
        int left = (n + 1) / 2;

        while(low <= high) {

            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            /* Initialize with Min Value if not exists */
            int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;

            /* Initialize with Max Value if not exists */
            int r1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;

            /* Case 1 - Found Sysmmetry - all left side elements smaller than all right side elements */
            if(l1 <= r2 && l2 <= r1) {

                /* Odd Case */
                if(n % 2 == 1) {
                    return Math.max(l1, l2);
                } 
                /* Even Case */
                else {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
            }
            /* l1 > r2 - Need less in the left side - Skip right side */
            else if(l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return 0;
    }
}
