class Solution:
    def maximumProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sorted_num = sorted(nums)
        
        if sorted_num[-1] > 0 and sorted_num[1] < 0:
            if sorted_num[0] * sorted_num[1] > sorted_num[-2] * sorted_num[-3]:
                return sorted_num[0] * sorted_num[1] * sorted_num[-1]
        return sorted_num[-2] * sorted_num[-3] * sorted_num[-1]