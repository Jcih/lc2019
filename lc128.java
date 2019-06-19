class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            set.add(n);
        }
        
        int res = 1;
        for (int n: set) {
            if (set.contains(n - 1)) continue;
            int curr = n;
            int temp = 1;
            while (set.contains(curr + 1)) {
                curr += 1;
                temp += 1;
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}