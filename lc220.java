//Solution I, two for loop.
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int value : nums) {
            set.add(value);
        }
        
        if (t == 0 && nums.length == set.size()) {
            return false;
        }
        
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = i+1 ; j <= i+k && j < nums.length ; j++) {

                if (Math.abs((long)nums[i]-(long)nums[j]) <= t) {
                    if (Math.abs(i-j) <= k) {
                        return true;
                    }
                }
            }
        }
        
        return false;
 
    }
}


//Solution II, TreeSet, floor(), ceiling(), faster the 63%
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> tset = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            //Find the successor of current element
            Integer s = tset.ceiling(nums[i]);
            if (s != null && s <= nums[i] + t) {
                return true;
            }
            
            //Find the predecessor of current element
            Integer g = tset.floor(nums[i]);
            if (g != null && nums[i] <= g + t) {
                return true;
            }
            
            tset.add(nums[i]);
            if (tset.size() > k) {
                tset.remove(nums[i - k]);
            }
        }
        return false;
    }
}