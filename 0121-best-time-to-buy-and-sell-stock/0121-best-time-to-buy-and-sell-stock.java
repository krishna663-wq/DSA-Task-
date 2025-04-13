class Solution {
    public int maxProfit(int[] prices) {
        int min_length = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]< min_length){
                min_length = prices[i];
            } else if(prices[i] - min_length > profit){
                profit = prices[i] - min_length;
            }
        }
        return profit;
    }
}