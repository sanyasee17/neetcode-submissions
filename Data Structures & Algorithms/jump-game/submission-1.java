class Solution {
    public boolean canJump(int[] nums) {
        int maxReachIndex = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(i > maxReachIndex) {
                return false;
            }
            maxReachIndex = Math.max(maxReachIndex, i + nums[i]);
        }
        return true;
    }
}
