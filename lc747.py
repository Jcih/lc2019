class Solution:
    def dominantIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        f_max = 0
        sec_max = 0
        ans = -1
        
        for i in range(len(nums)):
            if nums[i] > f_max:
                sec_max = f_max
                f_max = nums[i]
                
                ans = i
            elif nums[i] > sec_max:
                sec_max = nums[i]
        
        if f_max >= 2 * sec_max:
            return ans
        else:
            return -1