class Solution {
    public int reverse(int x) {
        long res = 0; //long range: -2^64 - 2^64 - 1; int range: -2^32 - 2^32 - 1; using long to avoid the res larger than int
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        return (int)res;//change long to int
        
    }
}