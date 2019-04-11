class Solution {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;// ^ is exclusive-or ("xor") operator. 
        int res = 0;
        
        while(n > 0) {
            if ((n & 1) != 0) {
                res++;
            }
            n>>=1;// n 右移 1 位
        }
        return res;
    }
}