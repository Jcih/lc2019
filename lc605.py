class Solution:
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        ans = 0
        
        for i in range(len(flowerbed)):
            if flowerbed[i]:
                continue
            if i > 0 and flowerbed[i - 1]: continue
            if i < len(flowerbed) - 1 and flowerbed[i + 1]: continue
            flowerbed[i] = 1
            ans += 1
        
        return ans >= n