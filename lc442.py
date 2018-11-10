class Solution:
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        
        Solution 1:
        ans = []
        
        for x in nums:
            idx = abs(x) - 1
            if nums[idx] < 0:
                ans.append(idx + 1)
            nums[idx] = -nums[idx]
        
        return ans
        
        """
        
        
        check = [0] * (len(nums) + 1)
        ans = []
        for i in nums:
            if check[i]:
                ans.append(i)
            else:
                check[i] = 1
        return ans
    
    