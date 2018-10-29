class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        result = []
        
        if len(prices) == 1:
            result.append(0)
        else:
            for i in range(len(prices) - 1):
                if prices[i + 1] > prices[i]:
                    result.append(prices[i + 1] - prices[i])
                else:
                    continue
        return sum(result)