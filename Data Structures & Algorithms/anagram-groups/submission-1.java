class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            
            /* Created Sorted value to take as key */
            int[] charCount = new int[26];
            for(char ch : str.toCharArray()) {
                charCount[ch - 'a']++;
            }
            String key = Arrays.toString(charCount);

            /* If not present, we need to create a new list */
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            /* Add to map */
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
