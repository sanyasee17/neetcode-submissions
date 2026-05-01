class Solution {
    public int minEatingSpeed(int[] piles, int requiredHour) {
        
        /* Koko can eat one banana per hour min */
        int low = 1;
        
        /* Max he can eat to complete in min possible hours - nums.len */
        int high = findMax(piles);

        int ans = 0;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            /* Lets check is with mid banana/per rate how much time take */
            int timeTaken = timeTakenToEatAllBananas(piles, mid);

            if(timeTaken <= requiredHour) {
                /* Able to eat all the bananans, 
                    but lets check if we can eat all with less hours */
                ans = mid;
                high = mid - 1;
                
            } else {
                /* We have to eat more bananas per hour */
                low = mid + 1;
            }
        }
        return ans;
    }

    private int timeTakenToEatAllBananas(int[] piles, int bananaPerHour) {
        int timeTaken = 0;
        for(int bananas : piles) {
            timeTaken += Math.ceil((double)bananas / (double)bananaPerHour);
        }
        return timeTaken;
    }

    private int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}
