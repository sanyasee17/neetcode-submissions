class Solution {
    public double myPow(double x, int n) {

        double result = myPowOfPositive(x, Math.abs(n));

        return n < 0 ? (1 / result) : result;
    }

    public double myPowOfPositive(double x, int n) {

        if(x == 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }

        double result = myPow(x, n / 2);
        result = result * result;

        return n % 2 == 1 ? x * result : result;

    }
}
