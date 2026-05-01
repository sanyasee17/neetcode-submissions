class Solution {
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while(start < end) {

            // swap
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // move start pointer one step ahead
            start++;

            // move end pointer one step back
            end--;
        }
        
    }
}