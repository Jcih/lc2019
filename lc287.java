//Solution I, time O(nlogn), space O(1), very slow, faster than 10%, done by myself
class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        
        int[] cop = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            cop[i] = nums[i];
        }
        
        Arrays.sort(cop);
        
        for (int j = 0; j < cop.length - 1; j++) {
            if (cop[j] == cop[j + 1]) {
                return cop[j];
            }
        }
        
        return -1;
    }
}


//Solution II , set, faster than 47%, Time O(n), space O(n)
class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        
        Set<Integer> appeared = new HashSet<>();
        
        for (int n: nums) {
            if (appeared.contains(n)) {
                return n;
            } else {
                appeared.add(n);
            }
        }
        
        return -1;
    }
}

//Solution III. fastest, faster than 100%, double pointer
class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }
} 