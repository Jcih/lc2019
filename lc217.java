//Solution I time complexity O(nlogn + n), 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 0)
                return true;
        }
        return false;
    }
}