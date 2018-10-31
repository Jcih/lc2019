class Solution:
    def findShortestSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        start, end, count = {}, {}, {}
        for i, x in enumerate(nums):
            if x not in start:
                start[x] = i
            end [x] = i
            count[x] = count.get(x, 0) + 1
        
        result = len(nums)
        degree = max(count.values())
        
        for x in count:
            if count[x] == degree:
                result = min(result, end[x] - start[x] + 1)
        
        
        return result