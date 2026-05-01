public class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

         do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(fast);
            fast = sumOfSquares(fast);
         } while (fast != slow);

        return slow == 1;
    }

    private int sumOfSquares(int n) {
        int output = 0;
        while (n != 0) {
            output += (n % 10) * (n % 10);
            n /= 10;
        }
        return output;
    }
}