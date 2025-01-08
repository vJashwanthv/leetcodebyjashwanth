class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int profit = 0;
        for(int i=0;i<len;i++){
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,prices[i] - min);
        }
        return profit;
    }
}