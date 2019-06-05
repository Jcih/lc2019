
// follow leetcode 26, still use double pointer.
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length < 3) return nums.length;
        
        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (!(nums[count - 1] == nums[count - 2] && nums[count - 1] == nums[i])) { // hard to understand
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}