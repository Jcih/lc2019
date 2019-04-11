class Solution {
    public int[] diStringMatch(String S) {
        /*
        int min = 0;
        int max = S.length();
        
    
        int[] res = new int[max + 1];
        
        for (int i = 0; i < max; i++) {
            if (S.charAt(i) == 'D') {
                res[i] = max--;
                
            }
            else {
                res[i] = min++;
            }
        }
        res[S.length()] = min;
        return res;
        */
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
        
}
}