package Interview;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buy=prices[0], sell=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<=buy)
            {
                buy=prices[i];
                sell=0;
            }
            else
            {
                sell=(int)Math.max(sell,prices[i]);
            }

        }
        if(sell==0)
            return sell;
        else
            return (sell-buy);


    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
