class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        set_nums = set(nums)
        
        if len(nums) == len(set_nums):
            return False
        else:
            return True