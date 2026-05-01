class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Remove Special Chars from left
            if(!alphaNum(s.charAt(left))) {
                left++;
                continue;
            }

            // Remove Special Chars from right
            if(!alphaNum(s.charAt(right))) {
                right--;
                continue;
            }

            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
