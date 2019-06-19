class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        
        int minBuy = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            } else {
               maxProfit = Math.max(maxProfit, prices[i] - minBuy); 
            }
        }
        return maxProfit;
    }
}