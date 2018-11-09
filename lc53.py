class Solution:
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        this_sum = 0
        max_sum = -2**31
        
        for i in range(len(nums)):
            if this_sum < 0:
                this_sum = 0
            this_sum += nums[i]
            max_sum = max(max_sum, this_sum)
        return max_sum