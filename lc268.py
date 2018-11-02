class Solution:
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        
        Solution 1:
        full = []
        for i in range(len(nums) + 1):
            full.append(i)
            
        set_b = set(full) - set(nums)
        return set_b.pop()
        """
        
        sum_nums = sum(nums)
        sum_ori = sum(range(1, len(nums) + 1))
        return sum_ori - sum_nums