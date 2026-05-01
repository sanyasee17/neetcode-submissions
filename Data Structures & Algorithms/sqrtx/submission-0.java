class Solution {
    public int mySqrt(int n) {

        int left = 0;
        int right = n;
        int ans = 0;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            long temp = (long) mid * (long) mid;

            if(temp <= n) {
                // This is possible answer
                ans = mid;

                // We can check more closer answer, which will be on right as on left all will be smaller.
                left = mid + 1;
            } else {
                // Skip the right side
                right = mid - 1;
            }
        }
        return ans;
    }
}