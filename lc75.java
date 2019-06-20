class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        
        //get the index of first number != 0
        int colFirst = 0;
        while (colFirst < nums.length && nums[colFirst] == 0) colFirst++;
        
        //get then index of last number != 2
        int colLast = nums.length - 1;
        while (colLast >= 0 && nums[colLast] == 2) colLast--;
        
        int index = colFirst;
        while (index <= colLast) {
            
            if (nums[index] == 1) {
                index++;
            } else if (nums[index] == 0) {
                swap(nums, colFirst, index);
                colFirst++;
                index++;
            } else if (nums[index] == 2){
                swap(nums, index, colLast);
                colLast--;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}