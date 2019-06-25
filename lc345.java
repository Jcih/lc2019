//Solution I faster than 50%
class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        String vowels = "aeiouAEIOU";
        
        
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            
            if (!vowels.contains(String.valueOf(c[i]))) {
                i++;
            }
            
            if (!vowels.contains(String.valueOf(c[j]))) {
                j--;
            }
            
            
            if (vowels.contains(String.valueOf(c[i])) && vowels.contains(String.valueOf(c[j]))) {
                char tmp = c[i];
                c[i++] = c[j];
                c[j--] = tmp;
            }
        }
        
        return String.valueOf(c);
        
    }
}


//Solution II. faster than 75%  indexOf() is faster than contains()
class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        String vowels = "aeiouAEIOU";
        
        
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            
            if (vowels.indexOf(c[i]) == -1) {
                i++;
            }
            
            if (vowels.indexOf(c[j]) == -1) {
                j--;
            }
            
            
            if (vowels.indexOf(c[i]) != -1 && vowels.indexOf(c[j]) != -1) {
                char tmp = c[i];
                c[i++] = c[j];
                c[j--] = tmp;
            }
        }
        
        return String.valueOf(c);
        
    }
}