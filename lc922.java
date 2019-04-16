class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int odd = 1;
        int even = 0;
        int[] res = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                res[odd] = A[i];
                odd += 2;
            }
            else {
                res[even] = A[i];
                even += 2;
            }
            
        }
        return res;
        
        
    }
}