class Solution:
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        
        solution1: time exceeded
        result = []
        
        for i in range(1, len(nums) + 1):
            if i not in nums:
                result.append(i)
        return result
        
        solution 2: time exceeded
        return [x for x in range(1, len(nums) + 1) if x not in nums]
        
        """
        
    
        return list(set(range(1, len(nums) + 1)) - set(nums))