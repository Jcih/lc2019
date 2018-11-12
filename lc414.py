class Solution:
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        solution 2:
        
        a = sorted(set(nums))
        
        if len(a) < 3: return max(a)
        return list(a)[-3]
        
        
        """
        a = set(nums)
        
        if len(a) < 3: return max(a)
        else:
            a.remove(max(a))
            a.remove(max(a))
            return max(a)