class Solution 
{
    public int maxProfit(int[] prices) 
    {
     int min=prices[0], pt=0;
     for(int i=1;i<prices.length;i++)
     {
         if(min>prices[i]) // [7,1,5,3,6,4]
         {
             min = prices[i];
         }
          else if(prices[i]-min>pt) 
          {
            pt = prices[i]-min;   
          }
     }
        return pt;
    }
}
