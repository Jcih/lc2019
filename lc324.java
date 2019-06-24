//hard, don't understand, need to review PriorityQueue.poll() , offer()
class Solution {
    public void wiggleSort(int[] nums) {
        int median = findKthLargest(nums, (nums.length + 1) / 2);
        int n = nums.length;
        
        int left = 0;
        int i = 0;
        int right = n - 1;
        
        while (i <= right) {
            if (nums[newIndex(i, n)] > median) {
                swap(nums, newIndex(left++, n), newIndex(i++, n));
            } else if (nums[newIndex(i, n)] < median) {
                swap(nums, newIndex(right--, n), newIndex(i, n));
            } else {
                i++;
            }
    }
    }
    
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            maxHeap.offer(i);
        
        }
        while (k-- > 1) {
            maxHeap.poll();
        }
        return maxHeap.poll();
    }
        
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
        
    public int newIndex(int index, int n) {
        return (1 + 2 * index) % (n | 1);
    }
}