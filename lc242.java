//Solution I, self solved,faster than 33% , need improvement
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        
        Arrays.sort(cs);
        Arrays.sort(ct);
        
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != ct[i]) {
                return false;
            }
        }
        
        return true;
        
    }
}


//Solution II, faster than 99.77%
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        
        int[] letterCounts = new int[256];//??
        
        for (char c: s.toCharArray()) {
            letterCounts[c]++; //not understand
        }
        
        for (char c: t.toCharArray()) {
            letterCounts[c]--;
            if (letterCounts[c] < 0) {
                return false;
            }
        }
        return true;
        
    }
}