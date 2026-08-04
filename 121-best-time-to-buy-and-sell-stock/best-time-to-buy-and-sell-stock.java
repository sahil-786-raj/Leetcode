import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxpft = 0;

        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxpft = Math.max(maxpft, profit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxpft; 
    }
}