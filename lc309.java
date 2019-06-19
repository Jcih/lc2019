//Don't understand
//https://github.com/fishercoder1534/Leetcode/blob/master/src/main/java/com/fishercoder/solutions/_309.java

//Solution I, Best time to buy and sell stock with cooldown
class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
            int prevSell = 0;
            int buy = Integer.MIN_VALUE;
            int prevBuy;
            for (int price : prices) {
                prevBuy = buy;
                buy = Math.max(prevSell - price, prevBuy);
                prevSell = sell;
                sell = Math.max(prevBuy + price, prevSell);
            }
            return sell;
    }
}

//Solution II
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
                return 0;
            }

            int b0 = -prices[0];
            int b1 = b0;
            int b2 = b0;
            int s0 = 0;
            int s1 = s0;
            int s2 = s0;

            for (int i = 1; i < prices.length; i++) {
                b0 = Math.max(b1, s2 - prices[i]);
                s0 = Math.max(s1, b1 + prices[i]);
                b2 = b1;
                b1 = b0;
                s2 = s1;
                s1 = s0;
            }
            return s0;

    }
}