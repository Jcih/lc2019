class Solution:
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max = 0
        sum = 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                sum += nums[i]
                if sum > max:
                    max = sum
                
            else:
                sum = 0
        return max