//use map to save the occurence of each number
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int i: map.keySet()) {
            if (map.get(i) > nums.length / 3){
                result.add(i);
            }
        }
        return result;
    }
}