class Solution {
    public int maxProfit(int[] prices) {
        int min_price=-1;
        int max_profit=-1;
        for(int i=0;i<prices.length;i++)
        {
            if(min_price==-1 || prices[i]<min_price)
            {
                min_price=prices[i];
            }
            int profit=prices[i]-min_price;
            if(max_profit==-1 || max_profit<profit)
            {
                max_profit=profit;
            }
        }
        return max_profit;
    }
}
