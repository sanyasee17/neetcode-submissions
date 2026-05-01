public class Solution {
    public double myPow(double x, int n) {
        /* Base Case */
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        double res = helper(x, Math.abs((long) n));
        /* Negative Power: 1/n */
        return (n >= 0) ? res : 1 / res;
    }

    private double helper(double x, long n) {
        /* Base Case */
        if (n == 0) {
            return 1;
        }
        /* Recusive Case */
        double half = helper(x, n / 2);
        /* Odd - add extra 'x' */
        return (n % 2 == 0) ? half * half : x * half * half;
    }
}