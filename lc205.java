//Solution I  time O(n), space O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i <= s.length() - 1; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            if (map.containsKey(sc)) {
                if (map.get(sc) != tc) return false;
            } else {
                if (map.containsValue(tc)) return false;
                map.put(sc, tc);
            }
        }
        return true;
    }
}