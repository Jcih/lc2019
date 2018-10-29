class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        sorted_nums = sorted(nums)
        result = 0
        
        if n == 1:
            result = nums[0]
        else:
            if n % 2 == 0:
                result = sorted_nums[n // 2]
            else:
                x = (n + 1 ) // 2
                result = sorted_nums[x - 1]

        return result