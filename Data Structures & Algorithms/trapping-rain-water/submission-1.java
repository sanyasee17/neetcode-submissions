class Solution {

    /* 
        Optimise using two pointer 
        Time Complexity - O(n)
        Space Complexity - O(1)
    */
    public int trap(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int total = 0;

        while(left < right) {
        
            /* We will calculate on the smaller side */

            /* If left height is smaller or equal */
            if(height[left] <= height[right]) {

                /* As left side is small, we have to check the left max 
                    if we can hold water */
                if(leftMax > height[left]) {
                    total += leftMax - height[left];
                } else {
                    /* Update Left max */
                    leftMax = height[left];
                }

                /* Move left */
                left++;
            }
            /* Right height is smaller */
            else {

                /* Check if we can hold water or not */
                if(rightMax > height[right]) {
                    total += rightMax - height[right];
                } else {
                    rightMax = height[right];
                }

                /* Move right */
                right--;
            }
        }

        return total;
    }
}
