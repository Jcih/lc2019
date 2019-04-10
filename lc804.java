class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> s = new HashSet<>();
        
        for (String word: words) {
            String code = "";
            for (char c: word.toCharArray()) {
                code = code + morse[c - 'a'];//Chars are in turn stored as integers(ASCII value) so that you can perform add and sub on integers which will return ASCII value of a char
            }
            s.add(code);
        }
        return s.size();
    }
}