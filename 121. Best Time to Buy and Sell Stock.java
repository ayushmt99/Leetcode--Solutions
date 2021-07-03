class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxpro = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min){
                min = prices[i];
            }
            if(maxpro < prices[i]-min){
                maxpro = prices[i]-min;
            }
        }
        return maxpro;
    }
}
