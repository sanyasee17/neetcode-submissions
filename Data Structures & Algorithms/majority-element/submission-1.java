class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 , element = 0;
        for(int num: nums){
            if(count == 0){
                element = num;
                count++;
            }

            if(element == num){
                count++;
            }
            else{
                count--;
            }
        }

        count=0;
        for(int num: nums){
            if(num==element){
                count++;
            }
        }
        return count > nums.length/2 ? element : -1;
    }
}