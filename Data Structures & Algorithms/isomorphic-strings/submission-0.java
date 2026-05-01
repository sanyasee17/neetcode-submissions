class Solution {
    public boolean isIsomorphic(String s, String t) {

        /* Edge Case */
        if(s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            /* If sChar exist must be mapped to tChar & 
                If tChar exists must be mapped to sChar
            */
            if((mapST.containsKey(sChar) && mapST.get(sChar) != tChar)
                || (mapTS.containsKey(tChar) && mapTS.get(tChar) != sChar)) {

                    return false;
            }

            /* Map and Store */
            mapST.put(sChar, tChar);
            mapTS.put(tChar, sChar);
        }
        return true;
    }
}