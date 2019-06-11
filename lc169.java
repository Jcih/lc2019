//Solution I
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > nums.length / 2) {
                return i;
            }
        }
        return -1;
    }
}

//Solution II, O(nlogn) time complexity, faster than 100%
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

//Solution III, Moore Voting Algorithm, faster than 100%. need review, didn't understand.
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majority = nums[0];
        for (int i = 1; i < nums.length; i++) {
          if (count == 0) {
            count++;
            majority = nums[i];
          } else if (nums[i] == majority) {
            count++;
          } else {
            count--;
          }
        }
        return majority;
    }
}
