class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int temp = (n - 1) % 26;
            // ASCII TABLE: 65 -- 90 for A - Z, 97 -- 122 a - z
            sb.append((char) (temp + 65));
            n = (n - 1) / 26;
        }
        return sb.reverse().toString();
    }
}