class Solution {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while(true) {
            if(n == 1) {
                return true;
            }
            n = digitSum(n);

            if(set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }
    }

    public int digitSum(int n) {
        
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }
}
