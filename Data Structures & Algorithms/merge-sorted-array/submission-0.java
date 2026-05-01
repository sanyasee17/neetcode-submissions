class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        /* Start filling the higher values from back of nums1 */

        int i = m - 1;
        int j = n - 1;
        int currentIndex = m + n - 1;

        while(j >= 0) {
            if(i >= 0 && nums1[i] >= nums2[j]) {
                nums1[currentIndex] = nums1[i];
                i--;
            } else {
                nums1[currentIndex] = nums2[j];
                j--;
            }
            currentIndex--;
        }
    }
}