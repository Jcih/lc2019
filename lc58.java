//faster than 6.24%, figured by myself
class Solution {
    public int lengthOfLastWord(String s) {
        
        
        String[] splited = s.split("\\s");
        
        if (splited.length < 1) return 0;
        
        return splited[splited.length - 1].length(); 
    }
}

//faster than 52%
class Solution {
    public int lengthOfLastWord(String s) {
        
        
        String[] splited = s.split(" ");// whats different?
        
        if (splited.length < 1) return 0;
        
        return splited[splited.length - 1].length(); 
    }
}