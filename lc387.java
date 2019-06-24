class Solution {
    public int firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                continue;
            }
            if (s.indexOf(c, i+1) == -1) {
                return i;
            } else {
                set.add(c);
            }
        }
        return -1;
    }
}