package leetcode;

public class Task2DynamicProgramming {
    public static void main(String[] args) {
        int[] a = new int[]{4, 7, 1, 3};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int currentMaxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                currentMaxProfit = Math.max(currentMaxProfit,prices[j] - prices[i] );
            }
            maxProfit = Math.max(maxProfit, currentMaxProfit);
        }
        return maxProfit;
    }

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
