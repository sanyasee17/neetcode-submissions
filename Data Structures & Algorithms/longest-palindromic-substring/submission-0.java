class Solution {


    public String longestPalindrome(String s) {

        String res = "";
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                
                if(isPalindrome(s.substring(i, j + 1))) {
                    String temp = s.substring(i, j + 1);
                    if(temp.length() > maxLen) {
                        maxLen = temp.length();
                        res = temp;
                    }
                }  
            }
        }

        return res;
    }

    public boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
