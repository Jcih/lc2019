class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}