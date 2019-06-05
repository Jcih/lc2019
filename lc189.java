
//Solution I: O(1) extra space means you can crete extra arrays with constant length
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1) return;
        
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        
        int index;
        for (int i = 0; i < nums.length; i++) {
            index = (i + k) % nums.length;
            nums[index] = newNums[i];
        }
    }
}

/*Solution II, fast
public static void arraycopy(Object source_arr, int sourcePos,
                            Object dest_arr, int destPos, int len)
Parameters : 
source_arr : array to be copied from
sourcePos : starting position in source array from where to copy
dest_arr : array to be copied in
destPos : starting position in destination array, where to copy in
len : total no. of components to be copied.

*/
class Solution {
       public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (length == 0 || length == 1) {
            return;
        }
        k %= length;
        int[] newnums = new int[length + k];
        System.arraycopy(nums, 0, newnums, k, length);
        System.arraycopy(nums, length - k, newnums, 0, k);
        System.arraycopy(newnums, 0, nums, 0, length);
    }
}


//Solution III, tricky
class Solution {
    public void rotate(int[] nums, int k) {
    int length = nums.length;
    if (length == 0 || length == 1) {
        return;
    }
    k %= length;
    reverse(nums, 0, length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, length - 1);
}

private void reverse(int[] arr, int start, int end) {
    while (start < end) {
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
        start += 1;
        end -= 1;
    }
}
}
