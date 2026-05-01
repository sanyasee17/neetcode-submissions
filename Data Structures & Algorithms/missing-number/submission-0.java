class Solution {
    /* Use XOR Properties */
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int elementXor = 0;
        int naturalNumXor = 0;
        for(int i = 0; i < n; i++) {
            elementXor ^= nums[i];
            naturalNumXor ^= i + 1;
        }
        return elementXor ^ naturalNumXor;
    }
}
