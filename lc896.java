class Solution {
    public boolean isMonotonic(int[] A) {
        
        boolean inc = true;
        boolean dec = true;
        
        for (int i = 0; i  < A.length - 1; i++) {
            inc &= A[i + 1] >= A[i];
            dec &= A[i + 1] <= A[i];
        }
        
        return inc || dec;
    }
}