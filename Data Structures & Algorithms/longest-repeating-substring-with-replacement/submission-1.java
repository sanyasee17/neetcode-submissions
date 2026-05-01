class Solution {

    public int characterReplacement(String s, int k) {
        
        int maxLen = 0;
        int maxFreq = 0;
        int n = s.length();

        for(int i = 0; i < n; i++) {

            int[] hash = new int[26];
            maxFreq = 0;

            for(int j = i; j < n; j++) {

                hash[s.charAt(j) - 'A']++;

                maxFreq = Math.max(maxFreq, hash[s.charAt(j) - 'A']);

                int len = j - i + 1;
                int changesRequired = len - maxFreq;

                if(changesRequired <= k) {
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }
}
