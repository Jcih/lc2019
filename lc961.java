class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> res = new HashSet<>();
        
        for (int a: A) {
            if (res.contains(a)) {
                return a;
            }
            else {
                res.add(a);
            }
        }
        return -1;
    }
}