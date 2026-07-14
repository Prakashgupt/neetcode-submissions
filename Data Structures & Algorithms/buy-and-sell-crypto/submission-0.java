class Solution {
    public int maxProfit(int[] prices) {

        int totalmax = 0;
        for(int i=0;i<prices.length;i++)
        {
          int max =0;

          for(int j=i+1; j<prices.length;j++)
          {
            max = Math.max(max, prices[j]-prices[i]);
          }
          totalmax = Math.max(totalmax,max);
        }
        return totalmax;  
    }
}
