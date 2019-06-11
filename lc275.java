
//Solution I, O(n) time complexity
class Solution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) return 0;
        
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                return citations.length - i;
            }
        }
        return 0;
    }
}


//Solution II, binary search, faster than 100%. time complexity O(logn)
class Solution {
    public int hIndex(int[] citations) {
        int left = 0;
        int len = citations.length;
        int right = len - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= (len - mid)) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return len - left;
    }
}