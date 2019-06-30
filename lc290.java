//self solved with result faseter than 99.35%
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        char[] ch = pattern.toCharArray();
        
        HashMap<Character, String> map = new HashMap<>();
        
        if (word.length != ch.length) {
            return false;
        }
        
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                if (word[i].equals(map.get(ch[i]))) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (map.containsValue(word[i])) {
                    return false;
                } else {
                    map.put(ch[i], word[i]);
                }
            }
        }
        
        return true;
    }
}