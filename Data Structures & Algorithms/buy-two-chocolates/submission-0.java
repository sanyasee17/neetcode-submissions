class Solution {
    public int buyChoco(int[] prices, int money) {
        
        /* We have to find the two min price chocolate */
        Arrays.sort(prices);
        int minAmountRequired = prices[0] + prices[1];

        if(minAmountRequired > money) {
            return money;
        }
        /* Return left over money */
        return money - minAmountRequired;
    }
}