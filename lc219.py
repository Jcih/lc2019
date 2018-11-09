class Solution:
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
                
        dict={}
        for i,j in enumerate(nums):
            if j in dict and abs(dict[j]-i)<=k:
                return True
            dict[j]=i
        return False