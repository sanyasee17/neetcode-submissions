class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            
            /* Created Sorted value to take as key */
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedString = new String(strArray);

            /* If not present, we need to create a new list */
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }

            /* Add to map */
            map.get(sortedString).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
