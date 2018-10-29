class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        result = 0

        for i in range(len(prices) - 1):
            if prices[i] < prices[i + 1]:
                if prices[i + 1] - prices[i] > result:
                    result = prices[i + 1] - prices[i]
                    
                for j in range(i + 1, len(prices)):
                    if prices[j] > prices[i]:
                        if prices[j] - prices[i] > result:
                            result = prices[j] - prices[i]
                        else:
                            continue
                else:
                    continue
            else:
                continue
        return result

            