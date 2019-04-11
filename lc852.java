class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        if (A.length < 3) 
            return -1;
        while (i < A.length - 1) {
            if (A[i] < A[i + 1]) {
                i++;
            }
            else {
                break;
            }
        }
        return i;
}
}