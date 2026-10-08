class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j = 1;
        int maxPro=0;
        while(j<=prices.length-1){
            if(prices[i]<prices[j]){
                int diff = prices[j]-prices[i];
                maxPro = Math.max(maxPro,diff);
            }else{
                i=j;
            }
            j++;
        }
        return maxPro;
    }
}
