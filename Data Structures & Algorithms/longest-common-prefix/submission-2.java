class Solution {
    public String longestCommonPrefix(String[] strs) {



        
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int minLength = Math.min(first.length(), last.length());

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < minLength; i++) {
            if(first.charAt(i) != last.charAt(i)) {
                break;
            }
            ans.append(first.charAt(i));
            
        }

        return ans.toString();
    }
}