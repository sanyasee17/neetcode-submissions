class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = findPrefixMax(height, n);
        int[] rightMax = findSuffixMax(height, n);
        int res = 0;

        for (int i = 0; i < n; i++) {
            /* If trap is possible */
            if (height[i] < leftMax[i] && height[i] < rightMax[i]) {
                res += (Math.min(leftMax[i], rightMax[i]) - height[i]);
            }
        }

        return res;
    }

    /* Find the prefix max */
    private int[] findPrefixMax(int[] arr, int n) {
        int[] prefixMax = new int[n];
        prefixMax[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        return prefixMax;
    }

    /* Find the suffix max */
    private int[] findSuffixMax(int[] arr, int n) {
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
        }

        return suffixMax;
    }
}
