class Solution {
    public int majorityElement(int[] nums) {
        int currentCount = 0;
        int currentElement = 0;

        for(int num : nums) {
            if(currentCount == 0) {
                currentCount = 1;
                currentElement = num;
            }
            else if(currentElement == num) {
                currentCount++;
            } else {
                currentCount--;
            }
        }
        currentCount = 0;
        for(int num : nums) {
            if(currentElement == num) {
                currentCount++;
            }
        }

        return currentCount > nums.length / 2 ? currentElement : -1;
    }
}