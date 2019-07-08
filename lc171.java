class Solution {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            res += (c[i] - 64) * (int) Math.pow(26, s.length() - i - 1);
        }
        return res;
    }
}