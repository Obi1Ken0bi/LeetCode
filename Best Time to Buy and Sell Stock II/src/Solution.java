public class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        while (i < prices.length) {
            while (i < prices.length - 1 && prices[i + 1] <= prices[i]) i++;
            int min = prices[i++];
            while (i < prices.length - 1 && prices[i + 1] >= prices[i]) i++;
            profit += i < prices.length ? prices[i++] - min : 0;
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
