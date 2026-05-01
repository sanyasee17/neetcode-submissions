class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0;
        int ten = 0;

        for(int bill : bills) {

            if(bill == 5) {
                five++;
            }
            else if (bill == 10) {
                /* Check if we have five coin to return or not */
                if(five > 0) {
                    five--;
                    ten++;
                } else {
                    /* Unable to sell, break and return false */
                    return false;
                }
            }
            else {
                /* Case 1 : We need one 10 coin and one 5 coin */
                if(five > 0 && ten > 0) {
                    five--;
                    ten--;
                }
                /* Case 2 : If we have three 5 coins */
                else if(five >= 3) {
                    five -= 3;
                }
                else {
                    return false;
                }
            }
        }
        /* Sold all lemonade */
        return true;
    }
}