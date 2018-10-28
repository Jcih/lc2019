class Solution:
    def matrixReshape(self, nums, r, c):
        """
        :type nums: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        origin_r = len(nums)
        origin_c = len(nums[0])
    
        one_d = []
        new_nums = []
        if origin_r * origin_c != r * c:
            return nums
        else:
            for i in range(origin_r):
                one_d += (nums[i])
            for i in range(0, r * c, c):
                new_nums.append(one_d[i:i+c])
                    
        return new_nums  