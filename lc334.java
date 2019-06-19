//misunderstanding: length 3 not means consecutive 3 elements.

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        
        int firstMin = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= firstMin) {
                firstMin = nums[i];
            } else if (nums[i] <= secMin) {
                secMin = nums[i];
            } else {
                return true;
            }
        }
        
        return false;
    }
}