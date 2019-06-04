//Solution I
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        
        String ans = "";
        for (int i = 0; i < numRows; i++) {
            int j = i;
            ans += s.charAt(i);
            
            while (j < s.length()) {
                int next = 2 * (numRows - i - 1);
                if (next > 0) {
                    j += next;
                    if (j < s.length()) 
                        ans += s.charAt(j);
                }
                
                next = 2 * i;
                if (next > 0) {
                    j += next;
                    if (j < s.length()) 
                        ans += s.charAt(j);
                }
            }
        }
        return ans;
    }
}

//SolutionII , best solution
class Solution {
    public String convert (String s, int numRows) {
        if (s.length() == 1 || s.length() <= numRows || numRows < 2) return s;
        char[] res = new char[s.length()];
        int step = 2 * (numRows - 1);
        int count = 0;

        for (int i = 0; i < numRows; i++) {
            int interval = step - i * 2;
            for (int j = i; j < s.length(); j+=step) {
                res[count] = s.charAt(j);
                count++;
                if (interval < step && interval > 0 && j + interval < s.length() && count < s.length()) {
                    res[count] = s.charAt(j + interval);
                    count++;
                }
            }
        }
        return new String(res);
    }
}