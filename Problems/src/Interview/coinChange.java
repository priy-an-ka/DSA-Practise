package Interview;

public class coinChange {
    static int accept=0, reject=0;
    public static int countCoins(int[] coins, int index, int amount)
    {
        if(index<0 || amount<0)
            return 0;

        if(coins[index]<=amount)
        {
            accept=1+countCoins(coins, index, amount-coins[index]);
        }
        else
        {
            reject=countCoins(coins, index-1, amount);
        }
        return (int)Math.max(accept,reject);

    }
    public static int coinChange(int[] coins, int amount) {

        return countCoins(coins,coins.length-1,amount);
    }

    public static void main(String[] args) {
        int[] coins = new int[]{2};
        int amount = 3;

        System.out.println(coinChange(coins, amount));
    }


}
