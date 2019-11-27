class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        ArrayList[] bucket = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int frequency = e.getValue();
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<Integer>();
            }
            bucket[frequency].add(e.getKey());
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size(); j++) {
                    result.add((int)bucket[i].get(j));
                }
            }
        }
        return result;
    }
}