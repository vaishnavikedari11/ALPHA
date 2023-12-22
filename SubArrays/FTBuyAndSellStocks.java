//buy and sell stocks
public class FTBuyAndSellStocks {
    public static int buySellStocks(int prices[]) {
        int Bp = Integer.MAX_VALUE;
        int Mprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (Bp < prices[i]) { // profit
                int profit = prices[i] - Bp;
                // todays profit
                Mprofit = Math.max(Mprofit, profit);
            } else {
                Bp = prices[i];
            }
        }
        return Mprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 4 };
        System.out.println(buySellStocks(prices));
    }
}
