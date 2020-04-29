class Solution {
    public int trailingZeroes(int n) {
        int result = 0;
        while (n > 4) {

            // n /= 5
            n = n / 5;
            // result += n
            result = result  + n;
        }
        return result;
    }
}