package ITsyuryupa;

public class BestTimeBuySellStock {
    public static int maxProfitFor2(int[] prices) {
        int ans = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > ans) {
                    ans = prices[i] - prices[j];
                }
            }
        }

        return ans;
    }

    public static int maxProfitFor(int[] prices) {
        int max_profit = 0;
        int current_min = prices[0];
        for (int price : prices) {
            if (max_profit < price - current_min) {
                max_profit = price - current_min;
            }
            if (current_min > price) {
                current_min = price;
            }
        }

        return max_profit;
    }
}
