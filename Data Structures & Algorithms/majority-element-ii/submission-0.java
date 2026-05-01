class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;

        int counter1 = 0;
        int element1 = 0;

        int element2 = 0;
        int counter2 = 0;

        for(int num : nums) {

            if(element1 == num) {
                counter1++;
            } 
            else if(element2 == num) {
                counter2++;
            } 
            else if(counter1 == 0 && element2 != num) {
                counter1 = 1;
                element1 = num;
            }
            else if(counter2 == 0 && element1 != num) {
                counter2 = 1;
                element2 = num;
            }else {
                counter1--;
                counter2--;
            }
        }

        /* Check the count */
        counter1 = 0;
        counter2 = 0;

        for(int num : nums) {
            if(num == element1) {
                counter1++;
            }
            if(num == element2) {
                counter2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if(counter1 > (n/3)) {
            ans.add(element1);
        }
        if(counter2 > (n/3)) {
            ans.add(element2);
        }

        return ans;
    }
}