class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        
        /* Find the frequncy for each num */
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        /* Store into an list so we can sort */
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            list.add(new int[] {entry.getKey(), entry.getValue()});
        } 

        /* Sort the list by value */
        list.sort((a, b) -> b[1] - a[1]);

        /* Find answers */
        int[] ans = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = list.get(i)[0];
        }

        return ans;
    }
}
