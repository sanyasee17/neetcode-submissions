class Solution {

    /* Solution 3 - Using Bit Manipulation */
    public int hammingWeight(int n) {
        
        int count = 0;

        /* Keep removing the last set bit, at one point all will be removed */
        while(n != 0) {
            
            /* Remove the last set bit */
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}
